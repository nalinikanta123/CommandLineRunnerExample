package com.dreamthoughts.CommandLineRunnerExample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerExampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerExampleApplication.class, args);
	}

    @Override
    public void run(String...args) throws Exception {
        System.out.println("Application Started !!");
    }
	
}
