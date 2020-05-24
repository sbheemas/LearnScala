package collectionsexamples

object ArrayProg3 {
  def main(args: Array[String]): Unit = {
    var i,sum,avg=0
    println("Enter number of subjects:")
    val numOfSub=scala.io.StdIn.readInt()
    println(s"Number of subjects: $numOfSub")
    var arr:Array[Int]=new Array[Int](numOfSub)
    for (i<- 0 to numOfSub-1)
        arr(i)=scala.io.StdIn.readInt()

    for (arrvalues <- arr){
      sum = sum + arrvalues
    }

    avg=sum/arr.length

    println(s"Avg : $avg")
  }
}
