package anq.model

import scalikejdbc._
import skinny.orm._

case class Survey(
  id: Long,
  title: String
)

object Survey extends SkinnyCRUDMapper[Survey] {
  override lazy val tableName = "surveys"
  override lazy val defaultAlias: Alias[Survey] = createAlias("s")

  override def extract(rs: WrappedResultSet, rn: ResultName[Survey]): Survey = {
    autoConstruct(rs, rn)
  }
}
