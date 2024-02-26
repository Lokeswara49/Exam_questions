public class OverRiding extends OverRideParent {
    public static void main(String[] args) {
        OverRiding objChild=new OverRiding();
        objChild.run(10);
        OverRideParent objParentRef=new OverRiding();
        objParentRef.run(20);
        OverRideParent objParent=new OverRideParent();
        objParent.run(30);

    }

    @Override
    public int run(int x){
        System.out.println("Child Method");
        return x;
    }
}
class OverRideParent{
    public int run(int x){
        System.out.println("Parent Method");
        return x;
    }
}