package package2

object TraitDemo {
  def main(args: Array[String]): Unit = {

    var t1 = new DerivedClass
    val result1 = t1.method1(5)
    val result2 = t1.method2(10)
    println("Result1: ")
    println(result1)
    println("Result2: ")
    println(result2)

  }
}
