val ScalatraVersion = "2.6.1"

organization := "anq"

name := "anq-server"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.3"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "org.json4s" %% "json4s-jackson" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.skinny-framework" %% "skinny-orm" % "2.5.1",
  "org.skinny-framework" %% "skinny-task" % "2.5.1",
  "org.skinny-framework" %% "skinny-test" % "2.5.1" % "test",
  "org.apache.commons" % "commons-dbcp2" % "2.1.1",
  "ch.qos.logback" % "logback-classic" % "1.1.+",
  "org.json4s" %% "json4s-native" % "3.5.2",
  "mysql" % "mysql-connector-java" % "8.0.8-dmr"
)

javaOptions ++= Seq(
  "-Xdebug",
  "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)

// these commands will be executed when invoking `sbt console`
initialCommands :=
  """
import scalikejdbc._
import skinny.orm._
skinny.DBSettings.initialize()
implicit val dbSession = AutoSession
"""