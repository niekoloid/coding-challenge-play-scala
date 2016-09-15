name := """leadiq-coding-challenge"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  javaEbean,
  cache,
  ws,
  "mysql" % "mysql-connector-java" % "5.1.26",
  "postgresql" % "postgresql" % " 9.1-901-1.jdbc4",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,

)

