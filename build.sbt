// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.8"

// ============================================================================

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.13.8",  // Consistent Scala version
    mainClass := Some("HelloWorld"),
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
      "org.postgresql" % "postgresql" % "42.6.0",
      "org.apache.spark" %% "spark-core" % "3.5.0",
      "org.apache.spark" %% "spark-sql" % "3.5.0" % "test",
      "org.scalaxb" %% "scalaxb" % "1.11.1",
      "com.typesafe.akka" %% "akka-actor" % "2.6.14",
      "com.typesafe.play" %% "play-json" % "2.9.2",
      "com.github.scopt" %% "scopt" % "4.1.0",
      "io.circe" %% "circe-core" % "0.14.1",
      "io.circe" %% "circe-generic" % "0.14.1",
      "io.circe" %% "circe-parser" % "0.14.1",
      "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % "2.23.5",
      "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.23.5"
    ),
    dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.15.2"
  )
