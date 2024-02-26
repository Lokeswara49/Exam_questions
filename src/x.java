import java.util.*;

public class x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        int first=0,second=0;
        boolean flag=true;
        while(i<=j){
            if(flag){
                if(a[i]>a[j]){
                    first+=a[i];
                    i++;
                }
                else{
                    first+=a[j];
                    j--;
                }
            }
            else{
                if(a[i]>a[j]){
                    second+=a[i];
                    i++;
                }
                else{
                    second+=a[j];
                    j--;
                }
            }
            flag=!flag;
        }
        if(first>second)
           System.out.println("PLAYER 1 WINS");
        else if(second>first)
           System.out.println("PLAYER 2 WINS");
        else
            System.out.println("DRAW");
    }
}
