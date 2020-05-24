package package1

import package2.MyClassC

object CaseClassDemo {

  var i=5
  private var j=10

  def main(args: Array[String]): Unit = {

    var str = MyCaseClass("SankirTech", "Bangalore")
    //val obj = new MyClassC()
    var s = MyCaseClass("","")

    println(str.name + " " + str.city )

    str.method1()

    str.city = "Mumbai"
    val newstr = str.copy()
    println("toString:")
    println(str.toString)
    println("hashCode:")
    println(str.hashCode())

    val str2 = str.copy(str.name, "Mumbai")
    println(str2.name + " " + str2.city    )
    val newstr1 = str.copy("Sanjay")
    val newstr2 = str.copy(name=str.name, city = "Mumbai")
    println(newstr.name + " " + newstr.city)
    println(newstr1.name + " " + newstr1.city)
    println(newstr2.name + " " + newstr2.city)

    if ( str.equals(newstr) ) { println("str and newstr are same")}

  }

  //case class MyCaseClass(name:String,city:String)
}
