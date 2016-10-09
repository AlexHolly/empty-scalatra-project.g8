## [giter8](http://github.com/n8han/giter8) template for empty Scalatra sbt project

### uses
https://github.com/AlexHolly/empty-scalatra-project.g8/blob/master/src/main/g8/default.properties

### predefined sbt plugins (require sbt 0.13.x):
https://github.com/AlexHolly/empty-scalatra-project.g8/blob/master/src/main/g8/project/plugins.sbt

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
