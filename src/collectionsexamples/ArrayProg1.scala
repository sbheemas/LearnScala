package collectionsexamples

object ArrayProg1 {
  def main(args: Array[String]): Unit = {
    //var a:Array[Int] = new Array[Int](10)
    var a: Array[Int] = Array(10)
    var i, sum: Int = 0
    a = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- 0 to 9) {
      sum = sum + a(i)

    }
    println(s"Sum is $sum")
    println("Length is " + a.length)

    println("Printing Array elements in a traditional imperative style")
    for (i <- 0 to a.length - 1) println(a(i))

    println("Printing Array elements with more functional style")
    //for (arrvalues <- a) {println(arrvalues*2)}
    for (arrvalues <- a) print(_:Int)

  }
}
