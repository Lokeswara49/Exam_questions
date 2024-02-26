class Parent {
    static int a=10;
    public static  void run(){
        System.out.println("Run");
    }
}

class Inheritance extends Parent {
    public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
        Inheritance o1=new Inheritance();
        o1.run();
      Object obj = Class.forName(args[0]).newInstance();

        System.out.println(obj.getClass().getName());
        System.out.println(Parent.a);
        Parent.run();
    }
    public void run1(){
        System.out.println("Hii");
//        super.run();
    }
}


