package practiceexamgenerater

object runner extends App {
  val calculation = new Calculation()

  println(calculation.calculateCategoryRelevance(new DataAccess().getAssessedExams(1, 1)))
}


/**
  * Created by yarince on 26/06/2018.
  */
class Calculation {
  def calculateCategoryRelevance(examResults: List[ExamResult]) = {
    val weightedExams = getWeightedExams(examResults)
    weightedExams
  }

  def getWeightedExams(examResults: List[ExamResult]): List[WeightedExam] = {
    examResults.zipWithIndex.map { case (it, current) =>
      new WeightedExam(
        it.examId,
        calculateWeight(examResults, current),
        it.questions.groupBy(q => q.questionType)
      )
    }
  }

  private def calculateWeight(examResults: List[ExamResult], current: Int) = {
    100 / examResults.zipWithIndex.map { case (_, index) => Math.pow(2.0, index) }.sum * Math.pow(2, current)
  }
}
