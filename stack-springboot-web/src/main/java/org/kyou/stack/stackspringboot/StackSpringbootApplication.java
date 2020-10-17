package org.kyou.stack.stackspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class StackSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackSpringbootApplication.class, args);
	}

}
