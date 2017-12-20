package com.example;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Servicio remoto para client-2
 * 
 * @author marojas
 *
 */
@FeignClient(value = "${my-clients.feign.client2}")
public interface EurekaClient2Service {

	/**
	 * Obtiene los datos de ejemplo desde el microservicio client-2
	 * 
	 * @return
	 */
	@GetMapping("/client2")
	public Map<String, Object> getRemoteData();
}
