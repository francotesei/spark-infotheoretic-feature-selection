name := "spark-infotheoretic-feature-selection"

version := "0.1"

organization := "com.github.sramirez"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.2.0"

resolvers ++= Seq(
  "Apache Staging" at "https://repository.apache.org/content/repositories/staging/",
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  Resolver.mavenLocal
)

publishMavenStyle := true


