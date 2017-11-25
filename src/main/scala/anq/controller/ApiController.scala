package anq.controller

import anq.model.Survey
import anq.stack.{DatabaseSessionSupport, JsonApiStack}
import org.scalatra.swagger._

class ApiController(implicit val swagger: Swagger)
  extends JsonApiStack
    with DatabaseSessionSupport
    with SwaggerSupport {

  protected val applicationDescription = "The flowershop API. It exposes operations for browsing and searching lists of flowers, and retrieving single flowers."

  val getSurveys: SwaggerSupportSyntax.OperationBuilder =
    (apiOperation[List[Survey]]("getSurveys")
      summary "Get all surveys"
      description "Get all surveys")

  val getSurvey: SwaggerSupportSyntax.OperationBuilder =
    (apiOperation[Survey]("getSurvey")
      summary "Get specific survey"
      description "Get specific survey"
      parameters pathParam[String]("id").description("Survey ID"))

  get("/surveys", operation(getSurveys)) {
    Survey.findAll()
  }

  get("/surveys/:id", operation(getSurvey)) {
    val id = params.getAs[Int]("id").getOrElse(-1)
    Survey.findById(id)
  }

}
