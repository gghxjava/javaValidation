package com.example.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {
    private AtomicInteger cnt=new AtomicInteger(0);
    @ReadOperation
    public int counter() {
        return cnt.getAndAdd(1);
    }
    @ReadOperation
    public int counters(@Selector int value) {
        return cnt.getAndAdd(value);
    }
}
