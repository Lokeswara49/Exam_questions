import java.util.Scanner;

public class numOfJumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=findJumps(a,n);
        System.out.println(ans);
    }

    static int findJumps(int[] a,int n){

        int reach=n-1;
        int jumps=0;
        while(reach!=0){
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(i+a[i]>=reach){
                    reach=i;
                    jumps++;
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return -1;
            }
        }
        return jumps;
    }
}
