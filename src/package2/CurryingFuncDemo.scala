package package2

object CurryingFuncDemo {
  def main(args: Array[String]): Unit = {
    val result = sum(5,10)
    println("Regular sum function: ")
    println(result)

    println("Curried sum: ")
    println(curriedSum(5)("xyz")(20))

    val result1 = curriedSum(4)(_)
    val result2 = result1("abc")(_)
    val result3 = result2(20)


    println(result3)

    /*
    val r = curriedSum(sum(5,6))(_)

    val r1 = r(prod(3,4))(_)

    val r2 = r1(sum(20,30))

    println ( r2)
    */

  }

  def sum(  a:Int, b:Int ) = {
    a + b
  }

  def prod( a:Int, b:Int) = {
    a * b
  }
  def curriedSum(f1: Int)(f2: String)(f3:Int) : String = {
    f2 + f1 + f3
  }

  def curMul(a:Int)(b:Int) :Int = {
    a * b
  }
}
