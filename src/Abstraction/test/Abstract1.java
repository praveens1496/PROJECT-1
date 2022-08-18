package Abstraction.test;

public class Abstract1 extends Abstract {

	@Override
	public void empname() {
		
		System.out.println("Arun");
	}

	@Override
	public void empnumber() {
		System.out.println("79463165");
		
	}
	public static void main(String[] args) {
		Abstract1 a = new Abstract1();
		a.empname();
		a.empnumber();
		a.empaddress();
	}
	
	

}
