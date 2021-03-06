name := """test2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  cache,
  ws,
  specs2 % Test,
  "io.strongtyped"%% "active-slick" % "0.3.4",
  "org.mariadb.jdbc" % "mariadb-java-client" % "1.1.9",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.1.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
