package anq.controller

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class MainServletTests extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[MainServlet], "/*")

  test("GET / on MainServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
