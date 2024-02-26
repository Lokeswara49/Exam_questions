import java.util.*;

public class Kreeti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String s= sc.next();
//        Map<Character,Integer> map=new LinkedHashMap<>();
//        for(int i=0;i<s.length();i++){
//            map.put(s.charAt(i),1);
//        }
//        map.forEach((k,v)->{
//            System.out.print(k);
//        });
//        int x=10;
//        String[] a=new String[x];
//        for(int i=0;i<x;i++){
//            a[i]=sc.nextLine();
//        }
//        result(a);
//        int x= sc.nextInt();
//        String[] a=new String[2];
//        for(int i=0;i<2;i++){
//            a[i]=sc.nextLine();
//        }
        int n=Integer.parseInt("-1");
        System.out.println(n);
        //result1(a);
    }
    static void result(String[] args){
        int n=Integer.parseInt(args[0]);
        int[] a=new int[args.length-1];
        for(int i=1;i<args.length;i++){
            a[i-1]=Integer.parseInt(args[i]);
        }
        Arrays.sort(a);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(a[i])){
                System.out.print(a[i]+" ");
                set.add(a[i]);
            }
            else{
                n++;
            }
        }
    }
    static void result1(String[] args){
        long n=Long.parseLong(args[0]);
        long r=Long.parseLong(args[1]);
        long num=fact(n);
        long den=fact(n-r)*fact(r);
        long ans=num/den;
        System.out.println(ans);
    }
    static long fact(long n){
        if(n==1 || n==0)
            return 1;
        long ans=1;
        for(long i=2;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
}
