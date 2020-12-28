package fibonacci;

import java.util.HashMap;

class fib {

    // plain recursion
    // (O) = 2^n

    public static int fibPlain(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibPlain(n - 1) + fibPlain(n - 2);
        }
    }
    
    // memoization
    // (O) = n
    
    public static Long fibMemo(Long n, HashMap<Long, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            if (n <= 2) {
                return (long) 1;
            } else {
                memo.put(n, fibMemo(n - 1, memo) + fibMemo(n - 2, memo));
                return memo.get(n);
            }
        }
    }
    public static void main(String args[]) {
        System.out.println(fibPlain(10));
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
        System.out.println(fibMemo((long) 50, memo));
    }
}