package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("El número de coches en base de datos es: " + repository.count());

		// Crear
		Coche toyota = new Coche(4547568l, "Toyota", "Prius", 2010);
		repository.save(toyota);

		System.out.println("El numero de coches en base de datos es: " + repository.count());
		// Recuperar
		System.out.println(repository.findAll());

	}

}
