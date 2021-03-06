resolvers in ThisBuild ++= Seq(
  "nexus-releases" at "http://nexus.coinffeine.com:8086/nexus/content/repositories/releases",
  "sonatype-releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2/",
  Resolver.sonatypeRepo("public"),
  Classpaths.sbtPluginReleases
)

addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.3.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.10.1")

addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "1.1.2")

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "0.98.0")
