package package2

object FunctionDemo {
    def main(args: Array[String]) {
      myFunction(Sum(2))
      myFunction(Prod(6,5))
      myFunction(Prod(10,20))
      myFunction(fn1)
    }

    def Prod( x:Int, y:Int): Int = {
      x * y
    }

    def Sum( x:Int) : Int = {
      x + 20
    }

    def fn1() : Int = {
      10
    }

    def myFunction( f: Int ): Unit = {
      println("In myFunction method")
      println("Param: " + f)

    }
}
