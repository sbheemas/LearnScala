package collectionsexamples

object ArrayProg2{
  def main(args: Array[String]): Unit = {
    var avg:Float=0
    var arr:Array[Int]=Array(5)
    var sum=0
    arr=Array(50,60,70,80,90)
    for (i<- 0 to arr.length-1) {
      sum=sum+arr(i)
    }
    println(s"Total marks: $sum")
    avg=sum/arr.length
    println(s"Average: $avg")
  }

}
