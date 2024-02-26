import java.util.*;

public class ExcessAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        List<String> i=new ArrayList<>();
        for(int j=0;j<n;j++){
            String s=sc.nextLine();
            i.add(s);
        }
        calculateExcessPaid(i);

    }
    static void calculateExcessPaid(List<String> itemList){
        double ans=0;
        int n=itemList.size();
        int i=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('A',10);
        map.put('B',25);
        map.put('C',20);
        map.put('D',125);
        map.put('E',75);
        double excess=0,actual=0;
        while(i<n){
            char c=itemList.get(i).charAt(0);
            double val = Double.parseDouble(String.valueOf(itemList.get(i).charAt(2)));
            double wval=0;
            if(val<2){
                wval=val;
            }
            else if(val>=2 && val<5){
                wval=(val)+(val)/100;
            }
            else if(val>=5 && val<10){
                wval=val+(val*5)/100;
            }
            else{
                wval=val+(val)/10;
            }
            excess+=(wval*10)*map.get(c);
            actual+=(val*10)*map.get(c);
            i++;
        }
        ans=excess-actual;
        int res=0;
        if(ans%1==0){
            res=(int)ans;
        }
        else{
            res=(int)ans+1;
        }
        System.out.println(res);
    }
}
