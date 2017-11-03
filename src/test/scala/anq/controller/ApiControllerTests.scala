package anq.controller

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class ApiControllerTests extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[ApiController], "/*")

  test("GET /surveys on ApiController should return status 200 and survey data") {
    get("/surveys") {
      status should equal(200)
      body should include("""[{"id":1,"content":"Foo"},{"id":2,"content":"Bar"}]""")
    }
  }

  test("GET /surveys/1 on ApiController should return status 200 and specified survey data") {
    get("/surveys/1") {
      status should equal(200)
      body should include("""[{"id":1,"content":"Foo"}]""")
    }
  }

}
