package com.justin.app.demovault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoVaultApplication.class, args);
	}


}
