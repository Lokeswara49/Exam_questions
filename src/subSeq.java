//import javafx.scene.effect.SepiaTone;
//import javafx.scene.transform.Scale;
//
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class AllPossibleSubSequences {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        Set<Character> set=new HashSet<>();
//        findSubSeq(s,0,s);
//    }
//    static void findSubSeq(String s,int i, String str){
//        if(i>=s.length()){
//            System.out.println(str);
//        }
//        else{
//            findSubSeq(s,i+1,str);
//            for(int j=i+1;j<s.length();j++) {
//                String str1=swap(str,i,j);
//                findSubSeq(s, i + 1, str1);
//            }
//
//        }
//    }
//    static String swap(String s,int i,int j){
//        String ans="";
//        for(int k=0;k<i;k++){
//            ans+=s.charAt(k);
//        }
//        ans+=s.charAt(j);
//        for(int k=i+1;k<j;k++){
//            ans+=s.charAt(k);
//        }
//        ans+=s.charAt(i);
//        for(int k=j+1;k<s.length();k++){
//            ans+=s.charAt(k);
//        }
//        return ans;
//
//    }
//}
