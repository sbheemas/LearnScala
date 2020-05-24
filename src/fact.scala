object fact {
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) {
        acc
      }
      else {
        //println("acc="+acc + ","+"n="+n)
        go(n-1, n*acc)
      }
    val a = go(n, 1)
    a
  }
  def main(args: Array[String]): Unit = {
    println(factorial(7))
  }
}
