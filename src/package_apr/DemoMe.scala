package package_apr

object DemoMe {

  def main(args: Array[String]): Unit = {
    val myObj1 = new MyClassA(20,40)
    val myObj2 = new MyClassB(10,20,30)
    myObj1.print()
    myObj2.print()
  }

}
