import java.util.*;
public class p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++){
            s+=e;
            e+=3;
        }
        System.out.println(s);
    }
}
