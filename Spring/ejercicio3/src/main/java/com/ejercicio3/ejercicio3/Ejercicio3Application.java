package com.ejercicio3.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

		PersonaRepository repository = context.getBean(PersonaRepository.class);

		System.out.println("El num de personas en base de datos es: " + repository.count());

		Persona Carlos = new Persona(2656, "Carlos", "Pérez", 35);
		repository.save(Carlos);

		System.out.println("El num de personas en base de datos es: " + repository.count());

		System.out.println(repository.findAll());
	}

}
