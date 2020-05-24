package package2

class Rational ( val n:Int,val d:Int ) {

  require ( d != 0)
  override def toString = { n + "/" + d }
   def add ( r : Rational ) : Rational = { new Rational ( n * r.d +  d * r.n , d * r.d)}

}