package package_apr

class MyClassB (override val x:Int, override val y:Int, val z:Int ) extends MyClassA(x,y) {
  var varZ : Int = z

  override def print(): Unit =  {
    println("Inside MyClassB : ")
    println("varX: " + varX )
    println("varY: " + varY )
    println("varZ: " + varZ )
    //println("a: " + a )   //this gives error.
  }

}