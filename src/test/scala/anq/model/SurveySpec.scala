package anq.model

import org.scalatest._
import org.scalatest.fixture.FunSpec
import scalikejdbc._
import scalikejdbc.scalatest._
import skinny._

class SurveySpec extends FunSpec with Matchers with DBSettings with AutoRollback {

  override def fixture(implicit session: DBSession) {
  }

  describe("Survey") {
    it("should find all entities") { implicit session =>
      Survey.findAll().size should be > 0
    }
  }

}
