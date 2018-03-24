/**
  * Created by yarince on 24/03/2018.
  */


object DayOne extends App {
  println("Hello, World!")
  println(1 + 1)
  println(1.+(1))
  println(5 + 4 * 3)
  println(5.+(4.*(3)))
  println(5.+(4.+(5).*(3)))

  println("abc".length)


  println("abc" + 4)
  println(4 + "abc")
  println(4 + "1.0")

  //  println(5*"abc")

  println(5 < 6)
  println(5 <= 6)
  println(5 <= 2)
  println(5 >= 2)
  println(5 != 2)

  val a = 1
  val b = 2

  if (b > a) {
    println("true")
  } else {
    println("false")
  }

  println(Nil)

  //  if(0) println("true")
  //  if(Nil) println("true")

  def whileLoop() {
    var i = 1
    while (i <= 3) {
      println(i)
      i += 1
    }
  }

  whileLoop()


  def forLoop() {
    println("for loop using Java-style iteration")
    for (i <- args.indices) {
      println(args(i))
    }
  }

  forLoop()

  val range = 0 until 10
  println(range)

  println(range.start)
  println(range.end)
  println(range.step)

  println((0 to 10) by 5)
  println((0 to 10) by 6)
  println(0 until 10 by 5)

  val range1 = (10 until 0) by -1
  println(range1)

  val range2 = 10 until 0
  println(range2)

  val range3 = 0 to 10
  println(range3)

}
