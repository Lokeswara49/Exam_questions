//import java.util.Scanner;
//
//public class RomanToNumber {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc
//    }
//    public static String intToRoman(int num) {
//        String s="",s1="";
//        int i=0;
//        while(num!=0){
//            int rem=num%10;
//            if(i==0)
//                s1=Roman(rem);
//            else if(i==1)
//                s1=Roman(rem*10);
//            else if(i==2)
//                s1=Roman(rem*100);
//            else if(i==3)
//                s1=Roman(rem*1000);
//            i++;
//            s=s1+s;
//            s1="";
//            num=num/10;
//        }
//        return s;
//    }
//    static String Roman(int x){
//        String str="";
//        if(x<=10){
//            if(x==4)
//                return "IV";
//            else if(x==1)
//                return "I";
//            else if(x==9)
//                return "IX";
//            else if(x==2)
//                return "II";
//            else if(x==3)
//                return "III";
//            else if(x==5)
//                return "V";
//            else if(x==6)
//                return "VI";
//            else if(x==7)
//                return "VII";
//            else if(x==8)
//                return "VIII";
//            else if(x==10)
//                return "X";
//        }
//        else if(x<=100){
//            if(x==20)
//                return "XX";
//            else if(x==30)
//                return "XXX";
//            else if(x==40)
//                return "XL";
//            else if(x==50)
//                return "L";
//            else if(x==60)
//                return "LX";
//            else if(x==80)
//                return "LXXX";
//            else if(x==90)
//                return "XC";
//            else if(x==70)
//                return "LXX";
//            else if(x==100)
//                return "C";
//        }
//        else if(x<=1000){
//            if(x==200)
//                return "CC";
//            else if(x==300)
//                return "CCC";
//            else if(x==400)
//                return "CD";
//            else if(x==500)
//                return "D";
//            else if(x==600)
//                return "DC";
//            else if(x==700)
//                return "DCC";
//            else if(x==800)
//                return "DCCC";
//            else if(x==900)
//                return "CM";
//            else if(x==1000)
//                return "M";
//        }
//        else{
//            if(x==3000)
//                return "MMM";
//            else if(x==2000)
//                return "MM";
//        }
//        return str;
//    }
//}
