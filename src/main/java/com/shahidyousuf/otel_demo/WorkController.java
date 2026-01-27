package com.shahidyousuf.otel_demo;

import com.shahidyousuf.otel_demo.dto.WorkResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;
import static net.logstash.logback.argument.StructuredArguments.kv;

@RestController
public class WorkController {

    private static final Logger logger = LoggerFactory.getLogger(WorkController.class);

    @GetMapping(value = "/work", produces = MediaType.APPLICATION_JSON_VALUE)
    public WorkResponse work(@RequestParam(name = "ms", defaultValue = "250") long ms) {
        logger.info("work api invoked", kv("requested_ms", ms));
        if (ms < 0 || ms > 60000) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ms must be between 0 and 60000");
        }
        String requestId = UUID.randomUUID().toString();
        long start = System.nanoTime();
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "application interrupted");
        }
        long actualMs = Math.max(0, (System.nanoTime() - start) / 1_000_000);
        logger.info("work api complete", kv("request_id", requestId), kv("requested_ms", ms), kv("actual_ms", actualMs));
        return new WorkResponse("work complete", ms, actualMs, requestId);
    }
}
