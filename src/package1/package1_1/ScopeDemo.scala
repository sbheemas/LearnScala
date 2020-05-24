package package1.package1_1

class ScopeDemo {
    private[package1_1] var i:Int = 5  //private within package1_1
     def addOne(a:Int) = a + 1
    private def addTwo(b:Int) = b + 2
    protected def pkg1addTwo(c: Int) = c * c
}
