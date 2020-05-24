package collectionsexamples

import scala.collection.immutable.ListMap

object ListMapProg {
  def main(args: Array[String]): Unit = {
    var listMap1: ListMap[String,String] = ListMap ("1"->"A","2"-> "B", "3"-> "C")

    println(s"listmap1 : $listMap1")
    println(s"first element: ${listMap1("1")}")
    println(s"second element: ${listMap1("2")}")

    var listMap2: ListMap[String,String] = listMap1 + ("4"-> "D")
    listMap2 = listMap2 + ("5" -> "E")
    println(s"$listMap2")

    var listMap3: ListMap[String,String] = listMap1 ++ listMap2

    listMap1 = listMap1 - "2"

    println(s"$listMap1")
    println(s"$listMap3")

    val emptyListMap: ListMap[String, String] = ListMap.empty[String,String]
    println(s"$emptyListMap")
  }
}
