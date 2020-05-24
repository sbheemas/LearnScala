package collectionsexamples

import scala.collection.mutable.ListBuffer

object MapDemo {
  def main(args: Array[String]): Unit = {
    val mapEx : Map [String, List[String]] = Map("fruit"-> List("banana","apple","mango"),
                                                  "car" -> List("Maruti","Hyundai","Honda") )

    //val person = Map[String,Int]

    println(s"$mapEx")

    var map1: Map[String,String] = Map(("1","A"), ("2","B"),("3","C"))

    println(s"$map1")

    var map2: Map[String,String] = Map("PD" -> "Plain Donut", "CD" -> "Chocolate Donut")

    println(s"ELement by key for PD : ${map2("PD")}")
    println(map2.get("AB"))
    println(s"$map2")

    println(map1.keys)

    map1 = map1 + ("4"->"D")
    println(s"$map1")

    val map4 = map1 + ("5"-> "E")
    println(s"$map4")

    map1 = map1 + ("PD"->"Plain Donut")
    println(s"$map1")
    var map5: Map[String,String] = map1 ++ map2

    println(s"$map5")


    map5 = map5 - ("CD")

    println(s"$map5")

    val e : Map[String, String] = Map.empty[String,String]

    println(s"$e")

  }
}
