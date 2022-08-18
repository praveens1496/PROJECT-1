package samepackage.test;

public class Employee extends Company {

	int id = 100;
	String name = "Arun";

	private void empid() {
		System.out.println("empid--->" + id);
	}

	private void empname() {
		System.out.println("empname--->" + name);
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.empid();
		e.empname();
		e.companyname();
		e.companylocation();
		e.machineType();

	}
}
