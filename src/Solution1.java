import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(biggest_on_digit(n));
    }
    static int biggest_on_digit(int input1){
        int min=9999999;
        int index=0;
        int x=input1;
        int i=3;
        int[] a=new int[4];
        while(x>0) {
            int rem = x % 10;
            a[i]=rem;
            if (rem < min) {
                min = rem;
                index = i;
            }
            i--;
            x /= 10;
        }
        i=3;
        int ans=0;
        for(int j=0;j<4;j++){
            if(j!=index){
                ans=ans*10+a[j];
            }
        }
        return ans;
    }


}
