package micronaut.grpc.srv;

import io.grpc.stub.StreamObserver;
import micronaut.grpc.srv.helloworld.GreeterGrpc;
import micronaut.grpc.srv.helloworld.HelloReply;
import micronaut.grpc.srv.helloworld.HelloRequest;
import micronaut.grpc.srv.service.GreetingService;

import javax.inject.Singleton;

@Singleton
public class GreetingEndpoint extends GreeterGrpc.GreeterImplBase {

    private final GreetingService greetingService;

    public GreetingEndpoint(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        final String message = greetingService.sayHello(request.getName());
        HelloReply reply = HelloReply.newBuilder().setMessage(message).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}