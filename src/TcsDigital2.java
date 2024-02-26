import java.util.Scanner;

public class TcsDigital2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int sum1=0;
        int sum2=0;
        boolean odd1=false,even1=false,odd2=false,even2=false;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                even1=true;
            }
            else {
                odd1 = true;
            }
            sum1+=a[i];
        }
        for(int j=0;j<m;j++) {
            b[j] = sc.nextInt();
            if(b[j]%2==0){
                even1=true;
            }
            else {
                odd1=true;
            }
            sum2+=b[j];
        }
        if(sum1%2==0 && sum2%2==0){
            System.out.println('0');
        }
        else if(sum1%2==0 && sum2%2!=0){
            if(odd2 && even1){
                System.out.println("1");
            }
            else if(even2 && odd1){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }
        else if(sum1%2!=0 && sum2%2==0){
            if(odd1 && even2){
                System.out.println("1");
            }
            else if(even1 && odd2){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }
        else{
            if(odd1 && even2){
                System.out.println("1");
            }
            else if(even1 && odd2){
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }


    }
}
