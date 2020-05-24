package sancollections

object ArrayProg2 {

  def main(args: Array[String]): Unit = {
    var i=0
    println("Enter the number of Integers")
    val numOfSub = scala.io.StdIn.readInt()
    println(s"Number of subjects: $numOfSub")
    var array:Array[Int] = new Array(numOfSub)
    //Populate the array with keyboard entries
    for (i <- 0 to numOfSub-1) {
      array.update(i, scala.io.StdIn.readInt() )
      //println("Array Length is " + array.length)
    }
   var sum, avg = 0
   for (ar <- array)
     sum += ar

    println("The average marks is " + sum/array.length)
  }



}
