package package1

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val obj = new Scope3Demo
    //println(obj.i)



    val obj1 = new ModifierTest()
    //println(obj1.a)
    //obj1.print()

    val obj2 = new B
    obj2.print()

    val person1 = Person("Chandrika")
    println(person1)


    }

  class B extends ModifierTest {
    val i : Int = 5
    override def print () {
      println("Inside class B:")
      super.print()
    }
  }
}
