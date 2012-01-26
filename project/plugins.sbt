resolvers ++= Seq(
  "seratch.github.com" at "http://seratch.github.com/mvn-repo/releases")

addSbtPlugin("com.github.seratch" %% "testgen-sbt" % "0.2")

resolvers ++= Seq(
  "mpeltonen.github.com" at "http://mpeltonen.github.com/maven/")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

resolvers ++= Seq(
  "less is" at "http://repo.lessis.me",
  "coda" at "http://repo.codahale.com")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.1")


