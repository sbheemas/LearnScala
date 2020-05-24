package traitexamples

object MainFrog {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    val frog1 = new Frog
    val phrog = new Frog1
    //frog.philosphy()
    val phil: Philosophical = phrog
    phil.philosphy()
  }

}
