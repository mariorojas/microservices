package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client1")
public class EurekaClient1Controller {
	
	@Autowired
	private EurekaClient2Service client2Service;

	@GetMapping
	public Map<String, Object> example() {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		return map;
	}
	
	/**
	 * Obtiene los datos de ejemplo desde el servicio remoto client-2
	 * 
	 * @return
	 */
	@GetMapping("/client2")
	public Map<String, Object> exampleClient2() {
		return client2Service.getRemoteData();
	}
}
