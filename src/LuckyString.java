import java.util.Scanner;
public class LuckyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(minOperations(s));
    }
    static int minOperations(String s){
        int c1=0;
        int c2=0;
        int c3=0;
        int i=0;
        int mid=(s.length())/2;
        int mid1=mid;
        while(i<mid1){
            if((int)s.charAt(i)>(int)(s.charAt(mid))){
                c1++;
            }
            else if((int)s.charAt(i)<(int)(s.charAt(mid))){
                c2++;
            }
            else{
                c3++;
            }
            mid++;
            i++;

        }
        c1=mid1-c1;
        c3=mid1-c3;
        c2=mid1-c2;

        int ans=Math.min(c1,Math.min(c2,c3));
        return ans;
    }
}
