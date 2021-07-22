package micronaut.grpc.srv.stub;

import io.grpc.ManagedChannel;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.grpc.annotation.GrpcChannel;
import io.micronaut.grpc.server.GrpcServerChannel;
import micronaut.grpc.srv.helloworld.GreeterGrpc;

@Factory
class Clients {

    @Bean
    GreeterGrpc.GreeterBlockingStub blockingStub(
            @GrpcChannel(GrpcServerChannel.NAME) ManagedChannel channel) {

        return GreeterGrpc.newBlockingStub(
                channel
        );
    }
}