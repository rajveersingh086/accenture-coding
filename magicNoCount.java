package accenture;
import java.util.*;
public class magicNoCount {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;

        for(int i =1;i<n;i++){
            String bin = Integer.toBinaryString(i);

            bin = bin.replace('0','1');
            bin = bin.replace('1','2');

            int sum =0;
            for(char ch :bin.toCharArray()){
                sum+=ch - '0';
            }
            if(sum%2!=0) count++;
        }
        System.out.println(count);
    }
}
