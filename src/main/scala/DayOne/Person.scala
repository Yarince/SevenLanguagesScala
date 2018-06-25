package DayOne

/**
  * Created by yarince on 25/03/2018.
  */
class Person(first_name: String) {
  println("Outer constructor")

  def this(first_name: String, last_name: String) {
    this(first_name)
    println("Inner constructor")
  }

  def talk() = println("Hi")
}

