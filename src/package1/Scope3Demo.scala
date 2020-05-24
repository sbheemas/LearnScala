package package1

import package1.package1_1.ScopeDemo

class Scope3Demo extends ScopeDemo {
  def method1: Unit = {
    println(i)
    addOne(2)
  }

}
