package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrudAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}

// Go to this website --> http://localhost:8080/hello
// What happens when you add ?name=name to the end of the URL?
// For CRUD - GET operation replace /hello with /api/books