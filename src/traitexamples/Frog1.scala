package traitexamples

class Frog1 extends Animal with Philosophical {
  override def toString = "green"
  override def philosphy(): Unit = {
    println("It ain't easy being "+ toString +"!")
  }

}
