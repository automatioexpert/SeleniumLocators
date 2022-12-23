package tests;

public class StringTest {

	public static void main(String[] args) {
		String str = "Steve";
		System.out.println(str);
		String lower = str.toLowerCase();
		System.out.println(lower);
		System.out.println(lower.length());

		System.out.println("==========================");
		
		int charCout=0;
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			charCout++;
		}
		System.out.println("Total characters present: "+charCout);
		
	}
}
