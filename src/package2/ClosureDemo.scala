package package2

import java.lang._
object ClosureDemo {
  def main(args: Array[String]): Unit = {
    factor = 3

    val multiplier = (i:Int) => { i * factor }
    println(multiplier(5)) //15

    val b = mult(6)
    println("The Value of b =" + b) //18

    factor=10

    method1
    println("The result of multiplier is " + multiplier(5) + " With a factor of " + factor)
  }

  var factor = 5

  def method1: Unit = {
    factor=20
    println("Hello " + factor)
  }

  def mult( a:Int) = {
    a * factor
}
}
