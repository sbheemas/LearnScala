package collectionsexamples

object flatmapprog {
  def main(args: Array[String]): Unit = {
    var donuts1: Seq[String] = Seq("Plain Donut","Chocolate Donut")
    var donuts2: Seq[String] = Seq("Vanilla Donut", "Strawberry Donut")

      var donutList: List[Seq[String]] = List(donuts1,donuts2)

    println(s"$donuts1")
    println(s"$donuts2")
    println(s"$donutList")

    var donutList2: List[String] = donutList.flatMap(Seq => Seq)


    println(s"$donutList2")
  }
}
