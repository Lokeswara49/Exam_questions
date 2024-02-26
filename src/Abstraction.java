abstract class Parent1{
    abstract void run();
}
public class Abstraction extends Parent1 {
    public static void main(String[] args) {
//        Abstraction obj=new Abstraction();
        try{
            int a=1/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){

            System.out.println("AE");
//        obj.run();
        }
    }

    @Override
    void run() {
        System.out.println("Hello");
    }
}
