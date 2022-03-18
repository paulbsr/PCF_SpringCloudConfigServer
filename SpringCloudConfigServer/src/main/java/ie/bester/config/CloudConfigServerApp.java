package ie.bester.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApp {
	
	public static void main(String [] args) {
		SpringApplication.run(CloudConfigServerApp.class, args);
		System.out.println("Spring Cloud Configuration Server, Dr. Mary Giblin.");
	}

}
