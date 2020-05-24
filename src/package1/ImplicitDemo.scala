package package1

object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    // Implicit parameter Example
    implicit val str="India"
    //implicit val str1="Bangalore"

    def greet(implicit name:String) = {
      println(s"Welcome to $name")
    }

    greet("Karnataka")
    greet

    // Implicit function Example
    implicit def intToStr(num: Int): String = s"String $num"

    println(42.toUpperCase()) // evaluates to "STRING 42"

    def myMethod(str: String) = {
      println(s"Hello $str")
    }
    // note that we're passing int
    myMethod(2019) // evaluates to "String 2019"

  }

}
