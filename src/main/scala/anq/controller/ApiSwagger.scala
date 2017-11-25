package anq.controller

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, NativeSwaggerBase, Swagger}


class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with NativeSwaggerBase

object ApiApiInfo extends ApiInfo(
  "The Api API",
  "Docs for the Flowers API",
  "http://scalatra.org",
  "apiteam@scalatra.org",
  "MIT",
  "http://opensource.org/licenses/MIT")

class ApiSwagger extends Swagger(Swagger.SpecVersion, "1.0.0", ApiApiInfo)