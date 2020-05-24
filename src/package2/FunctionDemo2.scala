package package2

object FunctionDemo2 {

    def main(args: Array[String]) {
      //sumOfFloatValues(1.5f, 2.5f ,3.5f,4.5f);

      println(testAnon(increase, 10))
      println(testAnon(cube, 3))
    }

    def sumOfFloatValues( s:Float* ) = {
      var i : Float = 0;
      var count:Int=0
      for( arg <- s ){
        println("Arg value :" + arg );
        i = i + arg;
        count+=1
      }
      println("Number of parameters passed " + count)
      println("Sum : " + i)
    }

  var increase = (x : Int) => (x + 1)

  var cube = (x:Int) => x * x * x

  def testAnon( a: Int => Int, b: Int)={
    a(b)
  }



}

