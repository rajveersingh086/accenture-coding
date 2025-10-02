package accenture;
import java.util.*;
public class passChecker {
    public static int pass(String str){
        int n = str.length();
        if(n<4) return 0;
        if(Character.isDigit(str.charAt(0)))return 0;

        boolean hasdigit = false;
        boolean hasupper = false;
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(ch== ' ' || ch=='/')return 0;
            if(Character.isDigit(ch)) hasdigit =true;
            if(Character.isUpperCase(ch)) hasupper= true;

        }
        if(!hasdigit || !hasupper) return 0;
        return 1;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        String str = sc.nextLine();
        System.out.println(pass(str));
    }
}
