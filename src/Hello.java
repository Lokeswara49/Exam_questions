import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            System.out.println(minMove(n));
        }
    }
    public static int minMove(int n){
        int count=0;
        while(n>0) {
            int temp=func(n);
            if (temp != 0) {
                n=func(n);
            }
            else{
                n--;
            }
            count++;
        }
        return count;
    }
    static int func(int n){
        for(int i=2;i<(n/2)+1;i++){
            for(int j=2;j<(n/2)+1;j++){
                if(i*j==n){
                    return Math.max(i,j);
                }
            }
        }
        return 0;
    }
}
