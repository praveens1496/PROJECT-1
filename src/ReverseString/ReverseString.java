package ReverseString;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Peter", si = "";
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			si = ch + si;
		}

		System.out.println(si);
	}
}
