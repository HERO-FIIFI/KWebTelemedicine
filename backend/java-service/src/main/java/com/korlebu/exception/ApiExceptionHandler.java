package com.korlebu.exception;
import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.time.Instant; import java.util.Map;
@RestControllerAdvice
public class ApiExceptionHandler {
 @ExceptionHandler(Exception.class) public ResponseEntity<Map<String,Object>> handle(Exception ex){ return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("timestamp", Instant.now(), "error", "Internal server error")); }
}
