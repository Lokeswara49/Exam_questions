import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int ans=0;
        while(temp>1) {
            if (temp % 2 == 0) {
                temp = temp/2;

            } else {
                break;
            }
        }
        if(temp==1){
            while(n>0){
                ans+=n%10;
                n/=10;
            }
            System.out.println("Yes");
        }
        else{
            ans=1;
            while(ans<n){
                ans=ans*2;
            }
            System.out.println("No");
        }
        System.out.println(ans);
    }
}
