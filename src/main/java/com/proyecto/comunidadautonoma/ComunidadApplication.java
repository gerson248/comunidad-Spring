package com.proyecto.comunidadautonoma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class ComunidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComunidadApplication.class, args);
		
		System.out.println("hola");
	}

}
