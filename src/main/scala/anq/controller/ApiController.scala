package anq.controller

import anq.stack.JsonApiStack

case class Survey(id: Int, content: String)

object SurveyData {
  var all = List(
    Survey(1, "Foo"),
    Survey(2, "Bar"),
  )
}

class ApiController extends JsonApiStack {

  get("/surveys") {
    SurveyData.all
  }

  get("/surveys/:id"){
    val id = params.getAs[Int]("id").getOrElse("")
    SurveyData.all.filter(_.id == id)
  }

}
