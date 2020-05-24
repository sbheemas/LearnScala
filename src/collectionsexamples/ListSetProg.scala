package collectionsexamples

import scala.collection.immutable.ListSet;

object ListSetProg {
  def main(args: Array[String]): Unit = {
    val listSet1: ListSet[String] = ListSet("Orange","Mango","Apple")
    println(s"ListSet1 = $listSet1")

    println("\nStep 2: How to check elements of immutable ListSet")
    println(s"Element Orange = ${listSet1("Orange")}")
    println(s"Element MAngo = ${listSet1("Mango")}")
    println(s"Element Kiwi = ${listSet1("Kiwi")}")

    println("\nStep 3: How to add elements of immutable ListSet using +")
    val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"
    println(s"Adding element Vanilla to ListSet using + = $listSet2")

    println("\nStep 4: How to add two ListSet together using ++")
    val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")
    println(s"Add two lists together using ++ = $listSet3")

    println("\nStep 5: How to remove element from the ListSet using -")
    val listSet4: ListSet[String] = listSet1 - ("Orange")
    println(s"ListSet without the element Orange = $listSet4")

    println("\nStep 6: How to initialize an empty ListSet")
    val emptyListSet: ListSet[String] = ListSet.empty[String]
    println(s"Empty ListSet of type String = $emptyListSet")

    //listSet1

  }
}
