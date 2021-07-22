# A Simple Micronaut GRPC Server application

As a disclaimer, this application was built using the tutorial found here: https://micronaut-projects.github.io/micronaut-grpc/3.0.0.RC1/guide/index.html. Micronaut's documentation is incredibly clear, but it does miss some minor but important details left for the dev to figure out. (such as the Service bean)

First, we must tell gradle to generate the Java files for the helloworld.proto file

```./gradlew generateProto```

The result will be java files generated in ```build/classes/java/main/micronaut/grpc/srv/helloworld```

Now, we can run the app

- ```./gradlew run``` to run the app
- ```curl http://localhost:8080/mgmt/health``` to show us that the gRPC server is up at the specified port of 8081.

Note that the gRPC server requires a gRPC client to be able to communicate to it using HTTP/2 and binary payloads. For the purpose of this app, we'll use a Java integration test.

To Test the gRPC server, run the integration test using the following task
- ```./gradlew test```

## Micronaut 2.5.5 Documentation

- [User Guide](https://docs.micronaut.io/2.5.5/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.5/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.5/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

