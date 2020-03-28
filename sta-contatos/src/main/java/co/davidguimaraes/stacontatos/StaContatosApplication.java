package co.davidguimaraes.stacontatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StaContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaContatosApplication.class, args);
	}

}
