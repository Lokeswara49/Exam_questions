import java.util.Scanner;
public class o {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        int m1=a[0],m12=a[1];
        int m2=b[0],m22=b[1];
        int i1=0,i12=0,i2=0,i22=0;
        for(int i=1;i<n;i++){
            if(m1>a[i]) {
                m1 = a[i];
                i1 = i;
            }
            if(m2>b[i]) {
                m2 = b[i];
                i2 = i;
            }
        }
        for(int i=0;i<n;i++){
            if(m12>a[i]&&a[i]!=m1) {
                m1 = a[i];
                i12 = i;
            }
            if(m22>b[i]&&b[i]!=m2) {
                m2 = b[i];
                i22 = i;
            }
        }
        if(i1!=i2)
            System.out.println(m1+m2);
        else if(i1==i2&&(m1+m22)>(m12+m2))
            System.out.println(m12+m2);
        else
            System.out.println(m22+m1);
    }
}
