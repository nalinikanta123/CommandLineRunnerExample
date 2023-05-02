package com.dreamthoughts.CommandLineRunnerExample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 3)
@Component
class BeanOne implements CommandLineRunner {
	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public void run(String... args) throws Exception {
		System.out.println("BeanOne run method Started !!");
	}
}
