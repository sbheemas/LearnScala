package package2

object FunctionDemo3 {


    def main(args: Array[String]) {

      println( function1( func2, 10) )
      println( function1( square, 5))

      println(strcat("Sankir" , "Technologies", "Bangalore"))

      val res1 = curstrcat("sankir")(_)
      val res2 = res1("technologies")
      println(res2)

      var incValue = (x :Int) => (x + 1)
      println(incValue(20))
      var divFunc = (x:Int,y:Int) => {
        println("x " + x)
        println("y " + y)
        x / y
      }
      println(divFunc(50,5))
    }

    def function1(f: Int => String, v: Int): String = {
      f(v)
    }

    def func2(x: Int) : String = {
      x.toString()

    }

  def square (x:Int) :String = {
    (x * x).toString
  }

  def strcat( s1:String, s2:String, s3:String) :String = {
    s1 + s2 + s3
  }

  def curstrcat(s1: String) (s2 :String ) = {   s1 + s2 }



}
