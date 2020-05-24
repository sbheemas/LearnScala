package collectionsexamples

object mapprog {
  def main(args: Array[String]): Unit = {
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
    println(s"Elements of donuts1 = $donuts1")

    println("\nStep 2: How to append the word Donut to each element using the map function")
    val donuts2: Seq[String] = donuts1.map(_ + " Donut")
    println(s"Elements of donuts2 = $donuts2")

    println("\nStep 3: How to create a donut sequence with one None element")
    val donuts3: Seq[AnyRef] = Seq("Plain", "Strawberry", None)
    donuts3.foreach(println(_))

    println("\nStep 4: How to filter out the None element using map function")
    val donuts4: Seq[String] = donuts3.map {
      case donut: String => donut + " Donut"
      case None => "Unknown Donut"
    }
    println(s"Elements of donuts4 = $donuts4")

   // println("\nStep 5: How to define couple of functions which returns an Option of type String")
   // def favoriteDonut: Option[String]= Some("Glazed Donut")

   // def leastFavoriteDonut: Option[String] = None

   // println("\nStep 6: How to use map function to filter out None values")
   // favoriteDonut.map(donut => println(s"Favorite donut = $donut"))
   // leastFavoriteDonut.map(donut=> println(s"Least favorite donut = $donut"))

    val num1 = List(1,2,3,4,5)
    println(num1)
    val num2 = num1.map(x => x * x)
    println(num2)

    var words = List( "apple","mango", "orange" )
      var w2=words.map(x=>x.toUpperCase())
      println(w2)

    var numList=List(3,5,6,9,10)
    var num3=numList.filter(x=>x>6)
    println(num3)

    var fruits=List("apple","mango","orange")
    fruits=fruits.filterNot(fruit => fruit.equals("mango"))
    println(fruits)


  }
}
