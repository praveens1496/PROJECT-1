package polymorphism.test;

public class Overloading {
	private void empdetails(String name) {
		System.out.println("\nEmplyee Name:" + "\t" + name);
	}

	private void empdetails(String name, int id) {
		System.out.println("\nEmplyee Name:" + "\t" + name + "\n\t Emp Id:" + "\t" + id);

	}

	private void empdetails(String name, int id, String address) {
		System.out.println("\nEmplyee Name:" + "\t" + name + "\n\t Emp Id:" + "\t" + id + "\n\t Address\t" + address);

	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.empdetails("Arun");
		o.empdetails("Arun", 999);
		o.empdetails("Arun", 999, "Chennai");
		o.empdetails("Peter");
		o.empdetails("Peter", 9999);
		o.empdetails("Peter", 9999, "Mettal Hospital");
	}
}
