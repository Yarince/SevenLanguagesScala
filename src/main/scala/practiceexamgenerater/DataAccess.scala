package practiceexamgenerater


import scala.io.Source
import org.json4s._
import org.json4s.native.JsonMethods._


/**
  * Created by yarince on 26/06/2018.
  */
class DataAccess {
  def getCategories(courseId: Int): List[CategoryPercentage] = {
    List(
      new CategoryPercentage("ATAM"),
      new CategoryPercentage("QA"),
      new CategoryPercentage("Algorithms"),
      new CategoryPercentage("Paradigma's"),
      new CategoryPercentage("Big Oh"),
      new CategoryPercentage("Programming"),
      new CategoryPercentage("ASR"),
      new CategoryPercentage("DCAR")
    )
  }

  def getAssessedExams(courseId: Int, studentNr: Int): List[ExamResult] = {
    // Here the db should do some stuff in the real implementation
    Source.fromFile("resources/question+result.json").getLines().toStream.foldLeft(new StringBuilder())((a, b) => a.append(b)).toString
    List(
      new ExamResult(1,"May 6, 130904129 7:38:46 PM", List(new Question(1, "Day")))
    )
  }
}