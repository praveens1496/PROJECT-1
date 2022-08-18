package samepackage.test;

public class Company extends Machine {
	String cn = "Arun&co";
	String cl = "chennai";

	public void companyname() {
		System.out.println("Company Name--->"+cn);
	}

	public void companylocation() {
		System.out.println("Company Location--->"+ cl);
	}
}
