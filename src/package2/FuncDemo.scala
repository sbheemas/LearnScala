package package2

object FuncDemo {
  def main(args: Array[String]): Unit = {

    val result = sum(20,30)
    println(result)

    var r = divtest(20)

    println(r._1 + " " + r._2 )
    r = divtest(22)
    println(r._1 +  " " + r._2)

    val t1 = Tuple2("abcd", 10)
    val t2 = Tuple3(1,2,"Bangalore")



  }

  def sum(a:Int, b:Int) : Int = {
    val c=a+b
    c
  }

  def divtest (a:Int) : (Int,String)={
    if(a%10==0)
      (a, "is divisible by 10")
    else
      (a, "is not divisible by 10")
  }
}
