import java.util.Arrays;
import java.util.Scanner;

public class TcsDigital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if(a[n-1]>b[m-1]){
            System.out.println("0");
        }
        else{
            int ans=0;
            int i=0;
            while(i<n){
                int j=i;
                int index=i;
                for(j=0;j<m;j++){
                    if(index>=n){
                        break;
                    }
                    if(a[index]<=b[j]){
                        ans++;
                        index++;
                    }
                }
                i=index+1;
            }
            System.out.println(ans);
        }
    }
}
