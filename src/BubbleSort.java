import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        bubbleSort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void bubbleSort(int[] a, int n){

        int index=-1;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n-i;j++){
                if(max<a[j]){
                    max=a[j];
                    index=j;
                }
            }
            int temp=a[n-i-1];
            a[n-i-1]=a[index];
            a[index]=temp;
        }
    }
}
