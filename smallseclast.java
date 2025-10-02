package accenture;
import java.util.*;
public class smallseclast {
    public static int secsmall(int arr[],int sum ){
        int n = arr.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i =0;i<n;i++){
            if(arr[i]<min1){
                min2 = min1;
                min1 =arr[i];
            }
            else if(arr[i]<min2){
                min2 = arr[i];
            }
        }
        if(min1 + min2 <=sum){
            return min1*min2;
        }
        else{
            return 0;
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secsmall(arr,sum));
    }
}
