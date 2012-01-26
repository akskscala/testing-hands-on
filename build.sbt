import testgen.TestgenKeys._

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10",
  "org.scalatest" %% "scalatest" % "1.6.1" ,
  "org.specs2" %% "specs2" % "1.7.1" ,
  "org.scala-tools.testing" %% "scalacheck" % "1.9"
)

seq(testgenSettings: _*)

testgenEncoding in Compile := "UTF-8"

testgenTestTemplate in Compile := "scalatest.Spec"

//testgenScalaTestMatchers in Compile := "MustMatchers"

