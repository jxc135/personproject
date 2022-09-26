package com.personproject.personproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class generalController {
    
    @GetMapping("/hello")
	public String Hello() {
		return "hello world";
	}

	@GetMapping("/helloyou")
	public String helloSomeone(@RequestParam (name="name", defaultValue= "helloWorld") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/getApiInfo")
	public ResponseEntity<?> getApiInfo(@RequestParam (name="name", defaultValue = "london") String location){
	
		String url = "http://api.openweathermap.org/data/2.5/forecast?q="+location+"&appid=3e59df4403ab714e43c3be93b1d8dda9";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	
	}
}
