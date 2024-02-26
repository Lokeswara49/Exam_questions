public class OverLoading {
    public static void main(String[] args) {
        OverLoading obj1=new OverLoading();
        System.out.println(obj1.add(2,5));
        System.out.println(obj1.add(10,12,15));
        System.out.println(obj1.add(10.0,20.0));
    }
    public int add(int x,int y){
        System.out.println("Two Var");
        return x+y;
    }
    public int add(int x,int y,int z){
        System.out.println("Three Var");
        return x+y+z;
    }
    public double add(double x,double y){
        System.out.println("Double add");
        return x+y;
    }
}
