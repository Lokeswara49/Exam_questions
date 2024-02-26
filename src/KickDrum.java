//import java.util.ArrayList;
//import java.util.List;
//
//class Game implements  Runnable{
//    @Override
//    public void run() {
//        move(Thread.currentThread().getId());
//    }
//
//      void move(long n){
//        //System.out.println(Thread.currentThread().getName()+" ");
//        //System.out.println(Thread.currentThread().getName()+" ");
//    }
//
//
//    static int x= 19;
//}
//public class KickDrum{
//    public static void main(String[] args) {
//        Game c=new Game();
//        new Thread(c, "10").start();
//        new Thread(new Game(), "11").start();
//
//
//
//        int[][] b = {{1, 2}, {3, 4}};
//        int[][] back = deep(b);
//
//        //System.out.println("oout"+(++b[0][1])*(++back[0][1]));
//
//        Game g = new Game();
//        g.x = 4;
//
//
//        //System.out.println("..."+Game.x++/++g.x);
//        System.out.println(Game.x++);
//        System.out.println(++g.x);
//
//
//
//
//    }
//
//
//    public static  int[][] deep(int[][] orginal){
//        int[][] back = new int[orginal.length][];
//
//        for (int i = 0; i < orginal.length; i++) {
//            back[i] = orginal[i];
//        }
//
//        return  back;
//    }
//
//
//    public static  <E extends  Number>List<E> cal(List<E> n){
//
//    }
//}
