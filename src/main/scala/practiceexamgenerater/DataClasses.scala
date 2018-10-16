package practiceexamgenerater

/**
  * Created by yarince on 26/06/2018.
  */

import java.sql.Date

class AnsweredQuestion(
                        val questionId: Int,
                        val questionText: String,
                        val categories: List[String],
                        val questionType: String,
                        val answeredOn: Date
                      )

class ExamResult(
                  val examId: Int,
                  val examDate: Date,
                  val questions: List[ReviewedQuestion]
                )

class WeightedExam(
                    val examId: Int,
                    val weight: Double,
                    val groupedQuestions: Map[String, List[ReviewedQuestion]]
                  )

class CategoryPercentage(
                              val category: String,
                              var percentage: Double = 0.0
                            )

class ReviewedQuestion(
                        val questionId: Int,
                        val resultWasGood: Boolean,
                        val questionText: String,
                        val categories: List[String],
                        val questionType: String
                      )

class Question(
                val questionId: Int,
                val questionText: String,
                val category: List[String]
              )
