import java.util.Scanner;
public class Searching{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        //int num=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        int f=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(s==a[i][j]){
                   f=1;
                   r=a[i][0];
                   break;
               }
               if(s<a[i][j]){
                   f=1;
                   r=a[i][j-1];
                   break;
               }
            }
            if(f==1)
                break;
        }
        System.out.println(r);
    }
}
