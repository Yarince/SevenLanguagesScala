package DayTwo

/**
  * Created by yarince on 25/06/2018.
  */
trait AntiCurse {
  val badWords = Map("shoot" -> "beans", "darn" -> "pucky")

  /**
    * This function does the same as convertBetter
    * @param input string that needs checking
    * @return
    */
  def convert(input: String): String = {
    val newSentence = new StringBuilder(input)
    badWords.foreach(badWord => newSentence.replaceAllLiterally("\\b%s\\b".format(badWord._1), badWord._2))
    newSentence.toString()
  }

  def convertBetter(input: String): String =
    badWords.foldLeft(input)((word, replacements) => word.replaceAll("\\b" + replacements._1 + "\\b", replacements._2))
  // https://stackoverflow.com/questions/43400598/replace-multiple-words-on-string-using-map-of-replacements

}
