package traitexamples

class MyAdd extends math1 with math2{
  override def addme(a: Int, b: Int) = {
    a + b
  }

  override def mulme(x: Int, y: Int): Double = {
    x*y
  }

  override def divme(x: Int, y: Int): Double = {
    x/y
  }
}
