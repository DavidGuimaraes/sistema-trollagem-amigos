package co.davidguimaraes.staconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaConfigApplication.class, args);
	}

}
