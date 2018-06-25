package DayTwo

/**
  * Created by yarince on 24/03/2018.
  */
object DayTwo extends App {

  def getSauce: String =
    "Sauce"

  println(getSauce)

  // Same notation
  // Unnecessary lambda
  println(List(4, 5, 6, 3).foldLeft(0)((a, b) => a + b))
  //Simplified
  println(List(4, 5, 6, 3).sum)

  def thing(): Unit = {
    println("Wow this is how closures work!")
  }

  thing()

  class Sentences extends AntiCurse {
    val sentence = "Ahh shoot, this is a darn nasty place!"

    def sayBadWords(): Unit = println(sentence)
    def tryToSayBadWords(): Unit = println(convertBetter(sentence))
  }

  val sentences = new Sentences
  sentences.sayBadWords()
  sentences.tryToSayBadWords()

}
