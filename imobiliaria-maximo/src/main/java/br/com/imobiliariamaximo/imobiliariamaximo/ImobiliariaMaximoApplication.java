package br.com.imobiliariamaximo.imobiliariamaximo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ImobiliariaMaximoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImobiliariaMaximoApplication.class, args);
	}

}
