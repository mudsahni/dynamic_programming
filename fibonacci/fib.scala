import scala.collection.mutable.HashMap 

object fib{

    // plain recursion
    // (O) = 2^n

    def fibPlain(n: Int): Integer = {
        if (n <= 2) {1}
        else {fibPlain(n-1) + fibPlain(n-2)}
    }

    //memoization 
    // (O) = n
    
    def fibMemo(n: Long, memo: HashMap[Long, Long]): Long = {
        if (memo.contains(n)) {
            memo.getOrElse(n,0)
        } else {
            if( n <= 2) {1}
            else {            
                memo(n) = fibMemo(n-1, memo) + fibMemo(n-2, memo)
                memo.getOrElse(n, 0)
            } 
        }
    }

    def main(args: Array[String]): Unit = {
        println(fibPlain(10))
        var memo: HashMap[Long, Long] = new HashMap[Long, Long]()
        println(fibMemo(50, memo))
    }
}