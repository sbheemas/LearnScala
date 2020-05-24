package package2

object StringsDemo {
  def main(args: Array[String]): Unit = {
    val a : String = "SanKir"
    val b = "Technologies"
    println("String length : " + a.length)
    println( "Substring hno in Technologies " + b.substring(3,6))
    println("Index of log in Technologies: " + b.indexOf("log"))


  }


}
