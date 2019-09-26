package com.example.ex3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class TestClient1 {

	private Logger logger = LoggerFactory.getLogger(TestClient1.class);

	@Value("${fullname:komal}")
	private String username;

	@GetMapping
	public ResponseEntity<String> extractMainImage() {

		logger.info("Returning username....." + username);
		if (username != null) {
			return ResponseEntity.ok(username);
		} else {
			throw new NullPointerException();
		}

	}
}
