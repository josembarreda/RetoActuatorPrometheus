package com.nttdata.bootcamp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

public class Controller {
	
	private Counter counter;
	
	public Controller(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("invocaciones totales").register(registry);
	}
	
	@GetMapping("/probando")
	public String funcionalidad() {
		counter.increment();
		return "¡FUNCIONA!";
	}

}
