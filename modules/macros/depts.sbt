scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick"          % "3.3.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3",
  "com.h2database"     % "h2"              % "1.4.197"
)

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

libraryDependencies ++= Seq("org.slf4j" % "slf4j-simple" % "1.7.25")

scalafmtOnCompile := true
