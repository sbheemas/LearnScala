package collectionsexamples

object ArrayProg4 {
  def main(args: Array[String]): Unit = {
    var i, num=0
    println("Enter number of integers:")
    num=scala.io.StdIn.readInt()
    var arr:Array[Int]= new Array[Int](num)
    for (i <- 0 to num-1)
      arr(i)=scala.io.StdIn.readInt()

    for(values <- arr)
      println ( values)

    var max:Int=0

    for (i <- 0 to num-1)
      {
        if ( arr(i) > max ) {
          max = arr(i)
        }
      }

    println(s"max value: $max")
  }
}
