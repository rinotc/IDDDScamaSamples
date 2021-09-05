ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "dev.tchiba"

lazy val commonSettings = Seq(
  scalacOptions := Seq(
    "-deprecation",
    "-feature"
  ),
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
)

lazy val iddd_agilepm = (project in file("iddd_agilepm"))
  .settings(
    commonSettings,
    name := "iddd_agilepm"
  )

lazy val iddd_common = (project in file("iddd_common"))
  .settings(
    commonSettings,
    name := "iddd_common"
  )

lazy val iddd_collaboration = (project in file("iddd_collaboration"))
  .settings(
    commonSettings,
    name := "iddd_collaboration"
  )

lazy val iddd_identityaccess = (project in file("iddd_identityaccess"))
  .settings(
    commonSettings,
    name := "iddd_identityaccess"
  )