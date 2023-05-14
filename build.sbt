/*ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "TwitterDownload"
  )
*/
organization := "com.devdaily"

name := "ScalatraTest1"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.10"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  // https://mvnrepository.com/artifact/org.apache.spark/spark-core
  libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.2",
    // https://mvnrepository.com/artifact/org.apache.spark/spark-sql
    libraryDependencies +=
"org.apache.spark" %% "spark-sql" % "3.3.2" % "provided",
  // https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
  libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.3.2" % "provided"


)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"