package com.shahidyousuf.otel_demo;

import com.shahidyousuf.otel_demo.dto.HelloResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloResponse hello() {
        long timestamp = System.currentTimeMillis();
        String requestId = UUID.randomUUID().toString();
        return new HelloResponse("Hello", timestamp, requestId);
    }
}
