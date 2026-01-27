package com.shahidyousuf.otel_demo;

import com.shahidyousuf.otel_demo.dto.HelloResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static net.logstash.logback.argument.StructuredArguments.kv;

import java.util.UUID;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloResponse hello() {
        long timestamp = System.currentTimeMillis();
        String requestId = UUID.randomUUID().toString();
        logger.info("hello endpoint invoked", kv("timestamp", timestamp), kv("request_id", requestId));
        return new HelloResponse("Hello", timestamp, requestId);
    }
}
