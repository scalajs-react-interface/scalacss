name := "scalacss"

//version := "2017.3.0-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.8"

val scala212 = "2.12.1"

scalaVersion := scala211

crossScalaVersions := Seq(scala211,scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

//Dependencies

libraryDependencies += "com.github.japgolly.scalacss" %%% "core" % "0.5.1"
libraryDependencies += "scalajs-react-interface" %%% "core" % "2017.3.23-beta" % Provided
libraryDependencies += "scalajs-react-interface" %%% "universal" % "2017.3.23-beta" % Provided

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"

bintrayVcsUrl := Some("git@github.com:scalajs-react-interface/scalacss.git")

publishArtifact in Test := false

//Test
resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test
//libraryDependencies += "scalajs-react-interface" %%% "enzyme" % "2017.1.0" % Test
scalaJSStage in Global := FastOptStage
