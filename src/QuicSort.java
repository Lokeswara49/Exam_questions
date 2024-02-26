import java.util.Scanner;

public class QuicSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        quickSortHelper(a,n-1,0);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void quickSortHelper(int[] a, int end,int start){
        if(start<end){
            int pivot=quickSort(a,start,end);
//            System.out.println("pivot"+pivot);
            quickSortHelper(a,pivot-1,start);
            quickSortHelper(a,end,pivot+1);
        }
    }
    static int quickSort(int[] a,int start,int end){
        int index=start-1;
        int pivot=a[end];
//        System.out.println("pivot1 "+pivot);
        for(int i=start;i<=end;i++){
            if(a[i]<pivot){
                index++;
                swap(a,i,index);
            }
        }
        index++;
        swap(a,index,end);
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
        return index;
    }
    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
