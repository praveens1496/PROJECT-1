package polymorphism.test;

public class overriding1111 extends Overriding {
	@Override
	public void empname() {
		System.out.println("Emplyee Name:" + "\t" + "Arun");
	}

	public void empaddress() {
		System.out.println("Emplyee Address:"  + "Chennai");
	}

	public static void main(String[] args) {
		overriding1111 o = new overriding1111();
		o.empname();
		o.empnumber();
		o.empaddress();

	}
}