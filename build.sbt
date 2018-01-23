name := """example-app"""

version := "1.0-SNAPSHOT"

enablePlugins(DebiaPlugin)
maintainer := "Jesus Rodriguez"
packageSummary := "Testing SBT"
  packageDescription := "package"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
