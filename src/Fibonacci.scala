import scala.collection.mutable
import scala.collection.mutable.HashMap

object Fibonacci {
  def main(args: Array[String]): Unit = {
    val inp: Int = 10;

    println(rfibdyn(1000, mutable.HashMap.empty[Int, Double] ))

    def rfib(n: Int): Int = n match {

      case 0 | 1 => n
      case _ => rfib(n - 1) + rfib(n - 2)
    }

    def rfibdyn(n: Int, h: mutable.HashMap[Int, Double]): Double = {
      if (h.contains(n)) return h(n)
      if (n<=1) {
        h ++= mutable.HashMap(n -> Int.int2double(n))
        return h(n)
      }
      else {
        //.put(n, rfib(n-1, a) + rfib(n-2, a));
        h ++= mutable.HashMap( n -> (rfibdyn(n-1, h) + rfibdyn(n-2, h)))
        return h(n);
      }
    }
  }
}

