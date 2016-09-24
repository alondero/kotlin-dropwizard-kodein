# kotlin-dropwizard-kodein
Dropwizard in Kotlin using Kodein DI

# Building
This project uses Gradle and Shadow for building. Using the provided Gradle Wrapper, run the following command:
~~~~
gradlew shadowJar
~~~~

# Running
The built jar can then be run by executing
~~~~
java -jar ExampleApplication-1.0-SNAPSHOT-all.jar server {config.yml}
~~~~

Once started, you can access a friendly message by navigating to localhost:8080/hello
