package package2

trait traitEx2 extends traitEx1 {

  override def method1(a: Int): Unit = {
    println( "traitEx2 : method1" )
    super.method1(a)
  }

  override def method2(b: Int): Unit = {
    println ("traitEx2 : method2")
    super.method2(b)
  }



}
