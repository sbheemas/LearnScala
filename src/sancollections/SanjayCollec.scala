package sancollections

import scala.collection.mutable

object SanjayCollec {

  def main(args: Array[String]): Unit = {
    //Example of mutable and immutable HashMap

    var myhash: mutable.HashMap[Int, String]
          = mutable.HashMap(1->"Sanjay",2->"Surabhi", 3->"Rohit", 4->"Chandrika")

    println("Emp name of 02  = " + myhash(2))


  }

}
