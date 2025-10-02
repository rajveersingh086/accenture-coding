package accenture;
import java.util.*;
public class ratHouse {
    public static int rat(int []arr,int r,int unit){
        int n = arr.length;
        if(n==0) return -1;
        int food = r*unit;
        int sum=0;
        for(int i= 0;i<n;i++){
            sum+=arr[i];
            if(sum>=food){
                return i+1;
            }
        }
            return 0;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(rat(arr,r,unit));
    }
}
