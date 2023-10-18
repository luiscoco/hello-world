
// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.8"
// That is, to create a valid sbt build, all you've got to do is define the
// version of Scala you'd like your project to use.

// ============================================================================

// Lines like the above defining `scalaVersion` are called "settings". Settings
// are key/value pairs. In the case of `scalaVersion`, the key is "scalaVersion"
// and the value is "2.13.8"

// It's possible to define many kinds of settings, such as:

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

lazy val root = (project in file("."))
  .settings(
    name := "hello-world",
    version := "1.0",
    scalaVersion := "2.13.5",
    mainClass := Some("HelloWorld")
  )


//libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
//libraryDependencies += "org.postgresql" % "postgresql" % "42.6.0"
//libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.0"

val sparkVersion = "3.5.0"
val circeVersion = "0.14.1"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
  "org.postgresql" % "postgresql" % "42.6.0",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion % "test",
  "org.scalaxb" %% "scalaxb" % "1.11.1",

  "com.typesafe.akka" %% "akka-actor" % "2.6.14",
  "com.typesafe.play" %% "play-json" % "2.9.2",

  "com.github.scopt" %% "scopt" % "4.1.0",
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion


)

// https://mvnrepository.com/artifact/com.github.plokhotnyuk.jsoniter-scala/jsoniter-scala-core
libraryDependencies += "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % "2.23.5"
libraryDependencies += "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.23.5"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.15.2"




