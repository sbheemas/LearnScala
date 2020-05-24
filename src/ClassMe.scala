class ClassMe (val x:Int,val y:Int) {
  var varX : Int = x
  var varY : Int = y

  def print() : Unit = {
    println("Inside MyClassA: ")
    println("var1: " + varX)
    println("var2: " + varY)
  }

}