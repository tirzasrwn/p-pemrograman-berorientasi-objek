# p-pemrograman-berorientasi-objek

## About

This repository is for object-oriented programming practical class. m stand for module, so if m03 is module 03 in the class.

## Requirement

- javac
- java
- maven
- make

This project was generated with maven.

```sh
mvn archetype:generate -DgroupId=com.tirzasrwn.app -DartifactId=p-pemrograman-berorientasi-objek -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

## Run

```sh
# example
make args="m01.HelloWorld"
# or if want to just run
make run args="m01.HelloWorld"
# alternative
mvn clean package exec:java -Dexec.mainClass="com.tirzasrwn.app.m01.HelloWorld"
```
