package Codify.gateway_test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class GatewayTestApplication {
	@Value("${MY_SECRET:default-value}")
	private String mySecret;

	@RequestMapping("/test")
	public String home() {
		return "Hello world \n Secret value: " + mySecret ;
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayTestApplication.class, args);
	}

}
