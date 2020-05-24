package package2

import package1.package1_1._
object ClassDemo {

    def main(args: Array[String]): Unit = {

      println("SUPERCLASS")
      val myObj1 = new MyClassA(20, 40)
      println("toString:")
      println(myObj1.toString())
      myObj1.print()

      myObj1.meth1(4)
      myObj1.meth1(5.6f)
      myObj1.meth1("abc")
      myObj1.meth1(2,3)
      myObj1.meth1(2,3,4.5f)

      println("SUBCLASS")
      val objectB = new MyClassB(1,2,3)
      objectB.print()
      /*
      val result = myObj1.inc(40)
     //println("i: " + myObj1.i)

      println(result)

      //val tuple1 = new Tuple3(10,"Bangalore","SanKir")
      //println(tuple1._1 + " " + tuple1._2 + " " + tuple1._3)


      val myObj2 = new MyClassB(30,40,50)
      myObj1.print()
      myObj2.print()
      */


      val object1 = new MyClassC(10, 15)
      val object2 = new MyClassC
      val object3 = new MyClassC(20)

      val object4 = new package1.ModifierTest

      println(object4.a)


      //val obj = new ScopeDemo
      //println(obj.i)



    }


}
