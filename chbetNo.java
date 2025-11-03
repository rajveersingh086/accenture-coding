package accenture;
import java.util.*;
public class chbetNo {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        boolean inNum = false;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                if(!inNum){
                    count++;
                    inNum = true;
                }
            }
            else{
                inNum = false;
            }
        }
        System.out.println(count);
    }
    
}
