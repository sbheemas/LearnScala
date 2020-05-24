package package1

object Person {
  def main(args: Array[String]): Unit = {
      println("Hello")
      println(apply("aaaa:String, bbbb:String"))
  }

  def apply(str:String) : String =  {
    str.toUpperCase
  }

}
