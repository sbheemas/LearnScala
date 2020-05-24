package sancollections

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {

  def main(args: Array[String]): Unit = {
    var x: ArrayBuffer[String] = new ArrayBuffer[String]()
    x += ("a", "b", "c")
    var buf = new ArrayBuffer[Int]()
    buf += 12

    println(x)
    x += "d"
    println(x)
    println("--------------")
    println(buf(0))
  }

}
