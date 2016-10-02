name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

assemblyJarName in assembly := "$name$" + ".jar"

seq(webSettings :_*)

mainClass in assembly := Some("JettyMain")

scalacOptions += "-language:postfixOps"

port in container.Configuration := 4567

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "org.scalatest"           %% "scalatest"                      % "$scalatest_version$" % "test",
  "org.scalatra"            %% "scalatra"                       % "$scalatra_version$",
  "org.scalatra"            %% "scalatra-scalate"               % "$scalatra_version$",
  "org.scalatra"            %% "scalatra-json"                  % "$scalatra_version$",
  "org.scalatra"            %% "scalatra-swagger"               % "$scalatra_version$",
  "org.scalatra"            %% "scalatra-swagger-ext"           % "$scalatra_version$",
  "org.json4s"              %% "json4s-jackson"                 % "$json4s_version$",
  "org.json4s"              %% "json4s-native"                  % "$json4s_version$",
  "org.json4s"              %% "json4s-ext"                     % "$json4s_version$",
  "commons-codec"            % "commons-codec"                  % "1.7",
  "org.eclipse.jetty"        % "jetty-server"                   % "$jetty_version$" % "container;compile;test",
  "org.eclipse.jetty"        % "jetty-webapp"                   % "$jetty_version$" % "container;compile;test",
  "org.eclipse.jetty.orbit"  % "javax.servlet"                  % "3.0.0.v201112011016" % "container;compile;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/"

ivyXML := <dependencies>
    <exclude module="slf4j-log4j12"/>
    <exclude module="grizzled-slf4j_2.9.1"/>
    <exclude module="jsr311-api" />
  </dependencies>

assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
  case "application.conf"                            => MergeStrategy.concat
  case "unwanted.txt"                                => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
