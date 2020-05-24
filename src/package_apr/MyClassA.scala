package package_apr

class MyClassA (val x:Int,val y:Int) {
  var varX : Int = x
  var varY : Int = y
  private var a : Int = 5

  def print() : Unit = {
    println("Inside MyClassA: ")
    println("var1: " + varX)
    println("var2: " + varY)
  }

}