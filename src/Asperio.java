import java.io.IOException;
import java.util.stream.*;
public class Asperio {
    public static void main(String[] args) {
        char c=Asperio.readInput();
        System.out.println(c);
    }
    public static char readInput(){
        char c='\u0000';
        int i=0;
        try{
            i=System.in.read();
            if(i!=-1){
                c=(char) i;
            }
        }
        catch (IOException e){
            System.out.println("Hello");
        }
        return c;
    }
}


