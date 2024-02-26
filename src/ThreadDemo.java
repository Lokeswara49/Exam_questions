class ThreadDemo1 extends Thread{
    public static void main(String[] args) {
        ThreadDemo1 t1=new ThreadDemo1();
        Thread t2=new Thread(new ThreadDemo2());
        t1.start();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
        }
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}
class ThreadDemo2 implements Runnable{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("Run");
        }

    }
}
class ABC implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadDemo.t1.getState());
        try
        {
            Thread.sleep(200);
        }

        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        //System.out.println("The state of thread t2 after invoking the method sleep2() on it - "+ t2.getState() );
    }
}

public class ThreadDemo implements Runnable
{
    public static Thread t1;
    public static ThreadDemo obj;
    public static void main(String argvs[])
    {
        obj = new ThreadDemo();
        t1 = new Thread(obj);
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());
        t1.start();
        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
    }

    public void run()
    {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);
        System.out.println("The state of thread t2 after spawning it - "+ t2.getState());
        t2.start();
        System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());
        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );
        try
        {
            t2.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());
    }

}
