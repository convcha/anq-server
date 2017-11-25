import anq.controller._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {

  implicit val swagger = new ApiSwagger

  override def init(context: ServletContext) {
    skinny.DBSettings.initialize()
    context.initParameters("org.scalatra.cors.allowedOrigins") = "http://petstore.swagger.io"

    context.mount(new IndexController, "/*")
    context.mount(new ApiController, "/api")
    context.mount (new ResourcesApp, "/api-docs")
  }
}
