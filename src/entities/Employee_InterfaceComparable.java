package entities;

public class Employee_InterfaceComparable implements Comparable<Employee_InterfaceComparable> {
	
	private String name;
	private Double salary;
	
	public Employee_InterfaceComparable(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee_InterfaceComparable other) {
		return name.compareTo(other.getName());
	}
	
	
	
	

}
