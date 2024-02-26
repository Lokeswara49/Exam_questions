import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            int count=1;
            int j=n;
            while(j>=i){
                System.out.print(j+" ");
                j--;
                count++;
            }
            j++;
            int count1=0;
            while(count<=n){
                System.out.print(j+" ");
                count++;
                count1++;
            }
            count=0;
            while(count<count1){
                System.out.print(j+" ");
                count++;
            }
            j++;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            System.out.println("");



        }
        for(int i=2;i<=n;i++){
            int count=1;
            int j=n;
            while(j>=i){
                System.out.print(j+" ");
                j--;
                count++;
            }
            j++;
            int count1=0;
            while(count<=n){
                System.out.print(j+" ");
                count++;
                count1++;
            }
            count=0;
            while(count<count1){
                System.out.print(j+" ");
                count++;
            }
            j++;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            System.out.println("");



        }
    }
}
