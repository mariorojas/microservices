package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client2")
public class EurekaClient2Controller {

	@GetMapping
	public Map<String, Object> example() {
		Map<String, Object> map = new HashMap<>();
		map.put("key2", "value2");
		return map;
	}
}
