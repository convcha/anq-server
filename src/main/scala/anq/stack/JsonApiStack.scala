package anq.stack

import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._

trait JsonApiStack extends ScalatraServlet with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

}
