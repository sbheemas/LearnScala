package package1

object TupleExample {
  def main(args: Array[String]): Unit = {
    val result = divisibleby7(55)
    if(result._1 == true)
      println(result._2 + " is divisible by 7")
    println(result)
  }

  def divisibleby7(num:Int) : (Boolean, Int) = {
    (( num % 7 == 0), num)
  }



}
