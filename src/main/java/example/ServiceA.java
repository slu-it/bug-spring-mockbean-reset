package example;

import org.springframework.stereotype.Component;


@Component
public class ServiceA {

    private final ServiceB serviceB;

    public ServiceA(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    public void foo() {
        serviceB.bar();
    }

}
