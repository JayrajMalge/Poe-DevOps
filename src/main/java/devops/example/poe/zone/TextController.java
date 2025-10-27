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
        return "Line 2";
    }

    // Text with dynamic content
    @GetMapping("/greeting")
    public String greeting() {
        return "Current time: " + java.time.LocalDateTime.now();
    }

    // JSON-like text (but still as plain string)
    @GetMapping("/info")
    public String applicationInfo() {
        return "poe app";
    }
}