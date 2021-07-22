package micronaut.grpc.srv;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import micronaut.grpc.srv.helloworld.GreeterGrpc;
import micronaut.grpc.srv.helloworld.HelloRequest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class GreetingEndpointTest {

    @Inject
    GreeterGrpc.GreeterBlockingStub blockingStub;

    @Test
    void testHelloWorld() {
        final HelloRequest request = HelloRequest.newBuilder()
                .setName("Kev")
                .build();

        String result = blockingStub.sayHello(request).getMessage();
        assertEquals("Hello Kev", result);
    }
}
