package com.nttdata.bootcamp.Actuator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id ="paises")
public class newActuator {
	
	private List<String> mundo = new ArrayList<>();
	
	@ReadOperation
	public List<String> paises(){
		return mundo;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String paisNuevo) {
		mundo.add(paisNuevo);
	}
	
	@DeleteOperation
	public void deleteOperation(@Selector String paisEliminar) {
		mundo.add(paisEliminar);
	}

}
