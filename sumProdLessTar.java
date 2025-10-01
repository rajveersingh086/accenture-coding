package accenture;

import java.util.*;

public class sumProdLessTar {
    public static String product(int[] arr, int target) {
        int n = arr.length;

        if (n == 0 || n < 2)
            return "-1";

        int[] arrcopy = arr.clone();
        Arrays.sort(arrcopy);

        int sum = arrcopy[0] + arrcopy[1];
        if (sum < target) {
            int product = arrcopy[0] * arrcopy[1];
            return String.valueOf(product);
        }
        return "0";
    }
}
