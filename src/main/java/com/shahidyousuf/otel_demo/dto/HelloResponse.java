package com.shahidyousuf.otel_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HelloResponse(String message, long timestamp, @JsonProperty("request_id") String requestId) { }
