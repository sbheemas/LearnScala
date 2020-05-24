package collectionsexamples

object FlattenMe {

  def main(args: Array[String]): Unit = {
    val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
    val donuts2: Seq[String] = Seq("Vanilla", "Glazed")
    val listDonuts: List[Seq[String]] = List(donuts1, donuts2)
    println(listDonuts)
    val listDonutsFromFlatten: List[String] = listDonuts.flatten
    println(listDonutsFromFlatten)
  }


}
