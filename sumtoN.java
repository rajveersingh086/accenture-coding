package accenture;
import java.util.*;
public class sumtoN {
    public static int diff(int n,int m){
        int sum1=0,sum2=0;
        if(m==0) return 0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
        }
        return sum2-sum1;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(diff(n,m));
    }
}
