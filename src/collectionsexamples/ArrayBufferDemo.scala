package collectionsexamples

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    var x:ArrayBuffer[String] = ArrayBuffer("a","b","c","d","e")
    println(x)
    x -= "a"
    println(x)
    x -= ("e","d")
    println(x)
    x += ("f","g")
    println(x)


  }
}
