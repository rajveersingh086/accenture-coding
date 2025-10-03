package accenture;
import java.util.*;
public class evensLoddsL {
    static int oddeven (int []arr){
        int n = arr.length;
        
        List <Integer> even = new ArrayList<>();
        List <Integer> odd = new ArrayList<>();
        for (int i = 0;i<n;i++){
            if(i%2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
            if(even.size()>2 && odd.size()>2) return 0;
            even.sort(Collections.reverseOrder());
            odd.sort(Collections.reverseOrder());
        }
        int secondlargest = even.get(1);
        int secondsmallest = odd.get(odd.size()-2);
        return secondlargest+secondsmallest;
    }
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(oddeven(arr));
    }
}
