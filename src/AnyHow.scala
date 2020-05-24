class AnyHow (x: String) {
  override def toString: String = {"Any How I have " + x + " I dont have to worry"}
  override def hashCode(): Int = {x.hashCode()}
  //println("The hash code of "+  x + " is " + hashCode() )
}
