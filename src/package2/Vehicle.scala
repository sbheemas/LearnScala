package package2

class Vehicle ( val a : Int, val b:String) {
  def this() {
    this(0," ")
  }

  def print() = {
    println("a: " + a + " b: " + b)
  }
}
