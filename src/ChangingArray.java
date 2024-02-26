//import java.util.Scanner;
//
//public class ChangingArray {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] a=new int[n];
//        int[] b=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]= sc.nextInt();
//        }
//        for(int i=0;i<n;i++) {
//            b[i] = sc.nextInt();
//        }
//        int ans=findLength(a,b,n);
//        System.out.println(ans);
//    }
//    static int findLength(int[] a,int[] b,int n){
//        int large=a[0];
//        int small=b[0];
//        int l=-1,r=-1;
//        int temp=-1;
//        int len=0;
//        boolean flag=false;
//        for(int i=0;i<n;i++) {
//            if (a[i] > b[i] && flag) {
//                temp = i;
//                small = Math.min(small, b[i]);
//                large = Math.max(large, a[i]);
//            }
//            if(a[i]==b[i]){
//
//            }
//            else {
//                if (i - 1 - temp > len) {
//                    len = i - temp;
//                    l = temp;
//                    r = i - 1;
//                }
//            }
//        }
//        for(int i=0;i<=r;i++){
//
//        }
//    }
//}
