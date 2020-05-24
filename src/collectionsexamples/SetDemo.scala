package collectionsexamples

import scala.collection.mutable.Set
object SetDemo {

  def main(args: Array[String]): Unit = {
    var set1 : scala.collection.mutable.Set[Integer] = scala.collection.mutable.Set()

    set1 += 10
    set1 += 20
    set1 += 10
    println(set1)

    var set2 = scala.collection.mutable.Set(10,20,30,40)
    println(set2)
    println(set1 ++ set2)
    println(set1)
  }
}
