package package2

class MyClassB ( val a:Int, val b:Int, val z:Int ) extends MyClassA(a,z) {
  
  def this() = {
    this(0,0,0)
  }

  override def print(): Unit =  {
    println("Inside MyClassB : ")

    println("x: " + x )
    println("y: " + y )
    println("z: " + z )
     println("a " + a )

    //println("i:" + i)
    println("j:" + j)
  }
}
