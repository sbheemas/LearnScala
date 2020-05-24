package package2

import scala.io.StdIn._
object ForLoop {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {
      println("the value of i is " +  i)
    }

    val numList = List(1,2,3,4,5,6,7,8,9,10);
    for ( i <- numList if i!=3 ; if i<8) {
      println(i)
    }

    var x:Int=0
    x += 1


    val revList = numList.reverse
    println(revList)

    val results = for( a <- numList if a != 3 ; if a < 8  )yield a
    println(results)

    /*
    val s="Sankir Tech Bangalore India"
    val splitStr =

    for (t <- splitStr ) {
      println(t)
    }
    println(s.length)
    println(s.substring(1))
    println(s.indexOf("Tec"))
    */


    println("Enter number of subjects:")

    val numOfSub=readInt()
    println("Enter Name:")
    val s = readLine()
    println(numOfSub + " " + s)
    val marks:Array[Integer] = new Array(numOfSub)
    var sum=0
    for ( j <- 0 to numOfSub - 1) {
      println("Enter marks: ")
      marks(j) = readInt()

      sum += marks(j)
    }

    println( "Average : " + sum / numOfSub)



    var strArray : Array[String] = new Array(5)
    var a:Array[Int]= Array(10)

    a=Array(20,10,30,40,50,60)
    var i:Int=0
    sum=0
    for (i<- 0 until a.length )
    {
      sum += a(i)
    }
    println("Sum :" + sum)


  }
}
