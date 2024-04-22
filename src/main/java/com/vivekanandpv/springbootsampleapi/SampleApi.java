package com.vivekanandpv.springbootsampleapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(Map.of("message", "Hello, world!"));
    }
}
