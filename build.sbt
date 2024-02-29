val scala3Version = "3.3.1"
val AkkaVersion = "2.9.0"
val AkkaHttpVersion = "10.6.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "srp-scala-codesherpas",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    resolvers += "Akka library repository".at("https://repo.akka.io/maven"),
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion
    )
)
