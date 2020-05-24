package package2

class Rectangle( val length:Int, val breadth : Int) {

  def add( rect : Rectangle) = {
    new Rectangle(length + rect.length , breadth + rect.breadth )
  }

}
