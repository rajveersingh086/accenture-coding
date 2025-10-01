package accenture;
import java.util.*;
public class switch1 {
    public static int cal(int a,int b,int c){
        switch(c){
            case 1: return a+b;
            case 2: return a-b;
            case 3: return a*b;
            case 4: return a/b;
            default: return 0;
        }
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        System.out.println(cal(a,b,c));
    }
}
