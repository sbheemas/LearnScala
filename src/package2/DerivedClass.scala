package package2

class DerivedClass extends traitEx1 with traitEx2 {
  override def method1 ( a:Int) :Unit = {
    println ("DerivedClass : method1")
    super.method1(a)
  }

  override  def method2 (b:Int)={
    println("DerivedClass : method2")
    super.method2(b)
  }

}
