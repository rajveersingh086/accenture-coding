package accenture;
import java.util.*;
public class rhysmeWord {
    static String find(String word ,String[]List,int n){
        String result ="";
        int maxlen=0;
        for(int i=0;i<n;i++){
            String curr = List[i];
            if(curr.equals(word))
                continue;

                int count =0;
                int wlen =word.length();
                int clen =curr.length();

                while (wlen-1 >=0 && clen-1>=0 && word.charAt(wlen-1)==curr.charAt(clen-1)){
                    count++;
                    wlen--;
                    clen--;
                }
                if(count>maxlen){
                    maxlen=count;
                    result=curr;
                }
        }
        return result;
    }
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        String word = sc.nextLine();
        int n =sc.nextInt();

        String []List = new String[n];
        for(int i =0;i<n;i++){
            List[i] = sc.next();
        }
        System.out.println(find(word,List,n));
    }
    
}
