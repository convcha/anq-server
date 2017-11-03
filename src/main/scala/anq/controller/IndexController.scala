package anq.controller

import org.scalatra.ScalatraServlet

class IndexController extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
