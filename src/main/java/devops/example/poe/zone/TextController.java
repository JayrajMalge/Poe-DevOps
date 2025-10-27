package devops.example.poe.zone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    // Simple text response
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    // Multiple lines of text
    @GetMapping("/multiline")
    public String multilineText() {
        return """
               This is a multiline text response.
               Line 1: Welcome to Spring Boot
               Line 2: This is a simple controller
               Line 3: Returning plain text data
               """;
    }

    // Text with dynamic content
    @GetMapping("/greeting")
    public String greeting() {
        return "Current time: " + java.time.LocalDateTime.now() + 
               "\\nWelcome to our Spring Boot application!";
    }

    // JSON-like text (but still as plain string)
    @GetMapping("/info")
    public String applicationInfo() {
        return """
               Application: Spring Boot Demo
               Version: 1.0.0
               Status: Running
               Description: Simple text controller example
               """;
    }
}