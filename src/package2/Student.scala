package package2

  class Student(val name:String, val maths:Int,val science:Int) {
  require ( name != null && name != "")
  override def toString = { "Name: " + name + " Maths: " + maths + " Science: " + science }

  def average( s:Student) : (Double,Double) = {

    val avgMaths = (maths + s.maths ) / 2
    val avgScience = ( science + s.science ) / 2
    val temp = new Tuple2(_:Double, _: Double)
    temp(avgMaths, avgScience)
  }
}
