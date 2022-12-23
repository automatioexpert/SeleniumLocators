package tests;

import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the required string on the console");
		String str=	scan.next();
		
		System.out.println("Input Provided: "+str);

		//String is a final class
		//So that Nobody can override or modify its methods
		
		System.out.println(str.length());
		if(str.length()==5) {
			System.out.println("String has 5 chars");
		}
		else if(str.length()>5) {
			System.out.println("String has more than 5 chars");
		}
	
		//close scan
		scan.close();
	}
}
