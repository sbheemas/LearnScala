package package1.package1_1

import package1.ModifierTest

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val object1 = new ModifierTest
    println(object1.a)
    object1.print()
    var string1 = "hello world"

    println(string1.capitalize)
    println(string1.length)

    val obj2 = new Scope2Demo
    println(obj2.meth1)
    val obj3 = new ScopeDemo

    obj3.addOne(2)
  }

}
