import java.sql.SQLOutput;
import java.util.Scanner;

public class GameWinner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(gameWinner(s));
    }
    static String gameWinner(String colors){
        String ans="";
        int ans1=0;
        int ans2=0;
        int i=0;
        int count=0;
        while(i<colors.length()){
                    if(colors.charAt(i)=='w'){
                       count++;
                  }
                  else if(count>=3){
                      ans1+=count-2;
                      count=0;
                   }
                  else {
                      count=0;
                    }
                    i++;
                }
        if(count>=3) {
            ans1 += count - 2;
            count = 0;
        }
        i=0;
        count=0;
        while(i<colors.length()){
            if(colors.charAt(i)=='b'){
                count++;
            }
            else if(count>=3){
                ans2+=count-2;
                count=0;
            }
            else{
                count=0;
            }
            i++;
        }
        if(count>=3){
            ans2+=count-2;
            count=0;
        }
        if(ans1>ans2){
            ans="wendy";
        }
        else{
            ans="bob";
        }
        return ans;
    }
}
