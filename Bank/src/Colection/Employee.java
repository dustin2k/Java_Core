package Colection;

import java.time.LocalDate;

public class Employee {
	private Long id; 
	private String name;
	private LocalDate dob;
	
	public Employee(Long id, String name, LocalDate dob) {
		this.id = id; 
		this.name = name; 
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

	
	
	
	
}
