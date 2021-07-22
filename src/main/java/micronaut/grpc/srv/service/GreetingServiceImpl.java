package micronaut.grpc.srv.service;

import javax.inject.Singleton;

@Singleton
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello(String str) {
        return "Hello ".concat(str);
    }
}
