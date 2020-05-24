package package2

object VehicleDemo {
  def main(args: Array[String]): Unit = {
    val v = new Vehicle(3, "abc")
    v.print()

    val s1 = new Student("", 90, 80)
    val s2 = new Student("Surabhi", 80, 90)

    println(s1.toString)
    println(s2.toString)


    val t = s1.average(s2)

    println( t._1, t._2)

    val r1 = new Rational(3,0)
    val r2 = new Rational(2,7)

    println(r1.add(r2))

    val rec1 = new Rectangle(5, 10)
    val rec2 = new Rectangle( 10, 20)

    val rec3 = rec1.add(rec2)
  }
}
