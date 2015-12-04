## [giter8](http://github.com/n8han/giter8) template for empty Scalatra sbt project

### uses
* Scala 2.11.7
* Scalatest 2.2.4
* scalatra 2.3.0.RC3
* json4s 3.2.10
* jetty 9.2.3.v20140905

### predefined sbt plugins (require sbt 0.13.x):
* sbt-eclipse 4.0.0
* sbt-idea 1.6.0

### usage:
Follow g8 [installation instructions](http://github.com/n8han/giter8#readme), [Install Issue](https://github.com/n8han/conscript/issues/72#issuecomment-156680186) or when using homebrew:

    brew install giter8

Go to your favourite shell and enter

    g8 alexholly/empty-scalatra-project
    cd [app-name]
    sbt compile


generate project files for your favourite IDE

    sbt eclipse
    sbt gen-idea

build lib/jar

    sbt publish-local
    
### License:
Licensed under the Apache License, Version 2.0, see http://www.apache.org/licenses/LICENSE-2.0
