package accenture;
import java.util.*;

public class hashCountAbs {
    public static int countabs(String s){
        Map<Character,Integer> freq = new HashMap<>();
        for(char num:s.toCharArray()){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        int even = Integer.MAX_VALUE;
        int odd  = Integer.MIN_VALUE;

        for(int count : freq.values()){
            if(count%2==0){
                if(count<even){
                    even = count;
                }
            }
            else{
                if(count > odd){
                    odd = count;
                }
            }
        }
        int diff = Math.abs(even - odd);
        return diff;
    }
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        //int n = sc.nextInt();
        String s = "frttttu";
        //String s = sc.nextLine();
        System.out.println(countabs(s));
    }
}
