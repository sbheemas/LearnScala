package package1

class Comp{
  private  val i : Int = 10
  def hello(){
    println(Comp.j)
    println("Hello, this is Companion Class.")
  }
}

object Comp {
  private val j : Int = 20
  def main(args:Array[String]){
    val object1 = new Comp()
    object1.hello()
    println(object1.i)
    println("And this is Companion Object.")
  }
}
