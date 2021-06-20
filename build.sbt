ThisBuild / organization := "com.mateus"
ThisBuild / scalaVersion := "3.0.0"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / name         := "jogo_dos_animais"
ThisBuild / javacOptions ++= Seq("-source", "1.11", "-target", "1.11")


lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
