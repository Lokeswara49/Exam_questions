import java.util.ArrayList;
import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxDis=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(a[i]==a[j]){
                    maxDis=Math.max(j-i,maxDis);
                    break;
                }
            }
        }
        System.out.println(maxDis);
    }

}
