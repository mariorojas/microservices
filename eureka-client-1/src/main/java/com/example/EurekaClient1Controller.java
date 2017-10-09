package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client1")
public class EurekaClient1Controller {

	@GetMapping
	public Map<String, Object> example() {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		return map;
	}
}
