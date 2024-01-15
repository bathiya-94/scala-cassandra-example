ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "scala-cassandra-example"
  )

libraryDependencies ++= Seq(
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.11.5",
  "com.datastax.cassandra" % "cassandra-driver-mapping" % "3.11.0",
  "com.typesafe" % "config" % "1.4.2"
)