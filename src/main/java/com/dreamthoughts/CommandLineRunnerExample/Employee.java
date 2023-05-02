package com.dreamthoughts.CommandLineRunnerExample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;

}
