package collectionsexamples


object ListProg {
  def main(args: Array[String]): Unit = {
    val listOfFruits:List[String] = List("Orange", "Apple","Mango", "Guava", "Grapes", "Pear")

    println(listOfFruits)

    for ( fruit <- listOfFruits)
      println(fruit)

    println(listOfFruits.isEmpty)

    println(listOfFruits.length)

    println(listOfFruits.contains("Orange"))
    println(listOfFruits.contains("Kiwi"))
    println(listOfFruits.reverse)

    println("The Sorted List " + listOfFruits.sorted)
    println("Sorted with Example 1 " + listOfFruits.sortWith((f1,f2) => f1.length < f2.length))
    println("Sorted with Example 2 " + listOfFruits.sortWith(_.length < _.length))


    var xlist = listOfFruits ++ List("Banana")

    println(xlist)

    xlist = "Kiwi" :: listOfFruits //rightside should always be a list. If you inverse this, it will error
    println(xlist)
    xlist = xlist :+ "Pineapple"

    println(xlist)

   xlist.foreach(fruit => { println (s"Fruit Name: $fruit" +  fruit)})
    //println(listOfFruits)

  }
}
