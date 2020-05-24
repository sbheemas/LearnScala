import package2.MyClassA

object HelloWorld {
  def main(args: Array[String]): Unit = {
    var myObj = new MyClassA(10,20)
    myObj.i
    println("Hello World !")
    var i:Int = 10
    val j:Int = 20
    var k = 10.2f
    k = 0.3f
    i = 20
    val (a,b,c) = Tuple3(1,2,3)


    println(a)
    println(b)
    println(c)
    //j = 30
    //println(i)
    //println(j)
  }
}
