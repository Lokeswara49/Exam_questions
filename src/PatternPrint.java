import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i>0;i--){
            int count=0;
            while(count<2*(i-1)){
                System.out.print("-");
                count++;
            }
            count=n;
            while(count>i){
                System.out.print((char) (count+96)+"-");
                count--;
            }
            count=i;

            while(count<=n){
                if(count==n)
                    System.out.print((char)(count+96));
                else
                    System.out.print((char)(count+96)+"-");
                count++;
            }
            count=0;
            while(count<2*(i-1)){
                System.out.print("-");
                count++;
            }
            System.out.println("");
        }
        for(int i=2;i<=n;i++){
            int count=0;
            while(count<2*(i-1)){
                System.out.print("-");
                count++;
            }
            count=n;
            while(count>i){
                System.out.print((char)(count+96)+"-");
                count--;
            }
            count=i;
            while(count<=n){
                if(count!=n)
                    System.out.print((char)(count+96)+"-");
                else
                    System.out.print((char)(count+96));

                count++;
            }
            count=0;
            while(count<2*(i-1)){
                System.out.print("-");
                count++;
            }
            System.out.println("");
        }
    }
}
