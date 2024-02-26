import java.util.Scanner;

public class WierdFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int ans=0;
        for(int i=0;i<=b;i++){
            ans+=func(i,a,b,c);
        }
        System.out.println(ans);

    }
    static int func(int n,int a,int b,int c){
        if(n>b){
            return n-c;
        }
            return func(a+func(a+func(a+func(a+n,a,b,c),a,b,c),a,b,c),a,b,c);
    }
}
