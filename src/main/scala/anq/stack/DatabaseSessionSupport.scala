package anq.stack

import scalikejdbc.AutoSession

trait DatabaseSessionSupport {
  implicit val dbSession: AutoSession.type = AutoSession
}
