package package2

class MyClassA (val x:Int, val y:Int) {
   var i : Int = 5
   protected var j : Int = 10

  def this() {
    this(0,0)
  }

  def this(x:Int) = {
    this(x,0)
  }

  override  def toString() = {
    "this object has " + x + " and " + y
  }

  println("Creating object...")

  def print() : Unit = {
    var i:Int = 10
    println("Inside MyClassA: ")
    println("var1: " + x)
    println("var2: " + y)

  }

  def getVarI = {
    i
  }

  def meth1(i:Int): Unit = {
    println( i)
  }

  def meth1( j:Float) = {
    println(j)
  }

  def meth1 ( k:String) = {
    println(k)
  }

  def meth1( i:Int, j:Int) = {
    println( i + j )
  }

  def meth1 ( i :Int, j:Int, k:Float ) = {
    println ( "i : " + i + " j : " + j + " k : " + k)
  }

  val inc = (x:Int) => x+1


}
