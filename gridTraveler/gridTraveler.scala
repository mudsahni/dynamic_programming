import scala.collection.mutable.HashMap 

object gridTraveler {

    // memoization
    // (O) = n*m

    def gT(m: Int, n: Int, memo: HashMap[String, Long]): Long = {
        if (memo.contains(s"${m}_${n}")) {memo.getOrElse(s"${m}_${n}", 0)}
        else {
            if (m == 0 || n == 0) {0}
            else if (m == 1 && n == 1) {1}
            else {
                memo(s"${m}_${n}") = gT(m-1, n, memo) + gT(m, n-1, memo)
                memo.getOrElse(s"${m}_${n}",0)
            }
        }
    }

    def main(args: Array[String]): Unit = {
        var memo: HashMap[String, Long] = new HashMap[String, Long]()
        println(gT(18,18,memo))
    }
}