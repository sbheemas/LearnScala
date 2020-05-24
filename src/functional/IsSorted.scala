package functional

object IsSorted {

  def main(args: Array[String]): Unit = {
    val retVal = {
      isSorted(Array(2, 1, 9, 11, 15), ((x: Int, y: Int) => x <= y))
    }
    println("The given Array is " + retVal)
  }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop (n: Int): Boolean = {
      if (n <= (as.length-2)) {
        if (ordered(as(n),as(n+1))) loop(n+1)
        else false
      }
      else true
    }
    loop(0)
  }

}
