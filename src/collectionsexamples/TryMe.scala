package collectionsexamples

import scala.collection.mutable.ArrayBuffer

object TryMe {
  def main(args: Array[String]): Unit = {

    var arrayofFruits=ArrayBuffer[Int]()
    arrayofFruits += 11
    arrayofFruits += 12
    arrayofFruits += (13,14,15)
    println(arrayofFruits)
    try {
      println(arrayofFruits(5))
    }
    catch {
      case e: IndexOutOfBoundsException => println(s"Index not available in the array $e")
      case e: Exception => println(s"Exception $e")
    }
    finally {
      print("Test")
    }

  }

}
