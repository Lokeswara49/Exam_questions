import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        MergeSortHelper(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void MergeSortHelper(int[] a, int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            MergeSortHelper(a,start,mid);
            MergeSortHelper(a,mid+1,end);
            MergeProcedure(a,start,mid,end);
        }
    }
    static void MergeProcedure(int[] a,int s,int m,int e){
        int n1=m-s+2;
        int n2=e-m+1;
        int[] a1=new int[n1];
        int[] a2=new int[n2];
        a1[n1-1]=a2[n2-1]=Integer.MAX_VALUE;
        int index1=0;
        int index2=0;
        for(int i=s;i<=m;i++){
            a1[index1++]=a[i];
        }
        for (int i = m+1; i <= e ; i++) {
            a2[index2++]=a[i];
        }
        index1=index2=0;
        for(int i=s;i<=e;i++){
            if(a1[index1]<a2[index2]){
                a[i]=a1[index1++];
            }
            else{
                a[i]=a2[index2++];
            }
        }

    }
}
