package gridTraveler;

import java.util.HashMap;

public class gridTraveler {
    
    // memoization
    // (O) = n*m

    public static Long gT(int m, int n, HashMap<String, Long> memo) {

        if (memo.containsKey(m + "_" + n)) {
            return memo.get(m + "_" + n);
        } else {
            if (m == 0 || n == 0) {
                return (long) 0;
            } else if (m == 1 && n == 1) {
                return (long) 1;
            } else {
                memo.put(m + "_" + n, gT(m - 1, n, memo) + gT(m, n - 1, memo));
                return memo.get(m + "_" + n);
            }
        }
    }
    
    public static void main(String args[]) {
        HashMap<String, Long> memo = new HashMap<String, Long>();
        System.out.println(gT(18, 18, memo));
    }
}
