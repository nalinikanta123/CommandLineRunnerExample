package com.dreamthoughts.CommandLineRunnerExample;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		employeeRepository.save(new Employee(1, "Ramesh", "Fadatare", "ramesh@gmail.com"));
		employeeRepository.save(new Employee(2, "Tom", "Cruise", "tom@gmail.com"));
		employeeRepository.save(new Employee(3, "John", "Cena", "john@gmail.com"));
		employeeRepository.save(new Employee(4, "tony", "stark", "stark@gmail.com"));

		logger.info("# of employees: {}", employeeRepository.count());

		logger.info("All employees unsorted:");

		Iterable<Employee> employees = employeeRepository.findAll();
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
		}

		logger.info("------------------------");

		logger.info("Deleting employee with id 1");
		employeeRepository.deleteById(1);

		logger.info("# of employees: {}", employeeRepository.count());

		employeeRepository.existsById(2);
		employeeRepository.findById(2);
	}
}
