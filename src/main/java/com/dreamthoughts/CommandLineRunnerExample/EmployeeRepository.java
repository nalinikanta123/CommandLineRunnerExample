package com.dreamthoughts.CommandLineRunnerExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	private List<Employee> list = new ArrayList<>();

	void save(Employee employee) {
		list.add(employee);
	};

	int count() {
		return list.size();
	};

	List<Employee> findAll() {
		return list;
	};

	void deleteById(int i) {
		list.remove(i);
	};

	boolean existsById(int i) {
		for (Employee e : list) {
			if (e.getId() == i) {
				return true;
			}
		}
		return false;
	};

	Employee findById(int i) {
		for (Employee e : list) {
			if (e.getId() == i) {
				return e;
			}
		}
		return null;
	};

}
