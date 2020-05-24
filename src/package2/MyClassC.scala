package package2

class MyClassC (var i:Int, var j: Int) {

  def this() {
    this(0,0)
  }

  def this(i:Int) {
    this(i,0)
  }

  def print(): Unit  = {
    println("Hello")
    println("Object created with num1: " + this.i + " num2: " + this.j)
  }

  print()
}
