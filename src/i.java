import java.util.Scanner;
import java.util.Stack;

public class i {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ansOpen="",ansClose="";
        String ans="";
        Stack<Character> stack=new Stack<>();
        int i=0;
        while (i<s.length()){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(!stack.isEmpty()){
                ansOpen+="(";
                stack.pop();
                ansClose+=")";
            }
            if(stack.isEmpty()){
                ans=ans+ansOpen+ansClose;
                ansOpen="";
                ansClose="";
            }
            i++;
        }
        ans=ans+ansOpen+ansClose;


        System.out.println(ans);
    }
}
