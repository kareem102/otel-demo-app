package com.shahidyousuf.otel_demo;

import com.shahidyousuf.otel_demo.dto.HelloResponse;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static net.logstash.logback.argument.StructuredArguments.kv;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private final Counter helloCounter;
    private final Timer helloTimer;

    public HelloController(MeterRegistry registry) {
        this.helloCounter = Counter.builder("hello.requests")
                .tag("endpoint", "/hello")
                .description("Number of hello requests")
                .register(registry);

        this.helloTimer = Timer.builder("hello.latency")
                .tag("endpoint", "/hello")
                .description("Latency of hello endpoint")
                .register(registry);
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public HelloResponse hello() {
        long start = System.nanoTime();
        long timestamp = System.currentTimeMillis();
        String requestId = UUID.randomUUID().toString();

        try {
            // business logic (simple)
            logger.info("hello endpoint invoked", kv("endpoint", "/hello"), kv("timestamp", timestamp), kv("request_id", requestId));
            return new HelloResponse("Hello", timestamp, requestId);
        } finally {
            helloCounter.increment();
            helloTimer.record(System.nanoTime() - start, TimeUnit.NANOSECONDS);
        }
    }
}
