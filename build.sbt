ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "scala-cassandra-example"
  )

libraryDependencies ++= Seq(
  "io.dropwizard.metrics" % "metrics-core" % "4.2.17",
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.11.5",
  "com.datastax.cassandra" % "cassandra-driver-mapping" % "3.11.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.22.1",
  "com.typesafe" % "config" % "1.4.2"
)