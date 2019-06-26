package cah.pharma.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PmodConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmodConfigServerApplication.class, args);
	}
}
