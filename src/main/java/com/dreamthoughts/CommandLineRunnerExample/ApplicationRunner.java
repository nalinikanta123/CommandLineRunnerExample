package com.dreamthoughts.CommandLineRunnerExample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println(" ApplicationRunner called");
	}
}
