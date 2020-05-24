package collectionsexamples

import scala.collection.mutable.HashMap
object HashMapProg {
  def main(args: Array[String]): Unit = {
    var hashMap1: HashMap[String,String] = HashMap(("PD","Plain Donut"),("CD","Chocolate Donut"), ("SD","Strawberry Donut"))

    println(s"$hashMap1")

    println(s"Element for PD : ${hashMap1("PD")}")
    println(s"Element for CD : ${hashMap1("CD")}")

    var hashMap2: HashMap[String,String] = hashMap1 ++ HashMap("KD"->"Krispy Kreme Donut")
    println(s"$hashMap2")

    var hashMap3: HashMap[String,String] = hashMap1 ++ hashMap2
    println(s"$hashMap3")

    var hashMap4: HashMap[String,String] = hashMap1 - ("CD")
    println(s"$hashMap4")

    var hashMap5: HashMap[String,String] = HashMap.empty[String,String]
    println(s"$hashMap5")
  }
}
