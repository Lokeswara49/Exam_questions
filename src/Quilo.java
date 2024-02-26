import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quilo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        List<List<String>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> al = new ArrayList<>();
            for(int j=0;j<m;j++) {
                String s = sc.next();
                al.add(s);
            }
            //al.add(s1);
            a.add(al);
        }
        String size= sc.next();
        System.out.println(validateImageSize(a,size));

    }
    static List<List<String>> validateImageSize(List<List<String>> imageUrls,String size){
        List<List<String>> ans=new ArrayList<>();

        long urlSize=0;
        long imgSize=0;
        size=size.substring(0,size.length()-2);
        if(size.contains("MB") || size.contains("Mb") || size.contains("mB") || size.contains("mb") ){
            System.out.println(size);
            long l=Long.parseLong(size);
            imgSize=(l)*1000000;
        }
        else if(size.contains("KB") || size.contains("Kb") || size.contains("kB") || size.contains("kb")){
            imgSize=(Long.parseLong(size))*1000;
        }
        else{
            imgSize=Long.parseLong(size)*1000000000;
        }
        for(int i=0;i<imageUrls.size();i++){
            List<String > a=new ArrayList<>();
            urlSize=Long.parseLong(imageUrls.get(i).get(1));
            a.add(imageUrls.get(i).get(0));
            if(urlSize<=imgSize){
                a.add("TRUE");
            }
            else{
                a.add("FALSE");
            }
            ans.add(a);
        }
        return ans;
    }
}
