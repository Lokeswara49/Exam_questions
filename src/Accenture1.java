import java.util.Scanner;

public class Accenture1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(GetJumpCount(x,y,n,a));
    }
    static int GetJumpCount(int input1,int input2,int input3,int[] input4){
        int ans=0;
        for(int i=0;i<input3;i++){
            while(input4[i]>0){
                input4[i]-=input1;
                if(input4[i]>0) {
                    input4[i] += input2;
                }
                ans++;
            }
        }
        return ans;
    }
}
