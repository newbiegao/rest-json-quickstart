# rest-json-quickstart

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

Running the application in dev mode
You can run your application in dev mode that enables live coding using:

./mvnw compile quarkus:dev
Packaging and running the application
The application can be packaged using:

./mvnw package
It produces the rest-json-quickstart-1.0.0-SNAPSHOT-runner.jar file in the /target directory. Be aware that it’s not an über-jar as the dependencies are copied into the target/lib directory.

If you want to build an über-jar, execute the following command:

./mvnw package -Dquarkus.package.type=uber-jar
The application is now runnable using java -jar target/rest-json-quickstart-1.0.0-SNAPSHOT-runner.jar.

Creating a native executable
You can create a native executable using:

./mvnw package -Pnative
Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

./mvnw package -Pnative -Dquarkus.native.container-build=true
You can then execute your native executable with: ./target/rest-json-quickstart-1.0.0-SNAPSHOT-runner

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

RESTEasy JSON serialisation using Jackson
This example demonstrate RESTEasy JSON serialisation by letting you list, add and remove quark types from a list.

Quarked!

Guide: https://quarkus.io/guides/rest-json
