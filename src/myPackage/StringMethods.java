package myPackage;

public class StringMethods {

	public static void main(String[] args) {

		String s = "welcome";
		String s1 = "to Java";

		// Length of string
		System.out.println(s.length());

		// Joining of strings

		System.out.println(s.concat(s1)); // welcome to Java

		// Triming the string

		s = "         welcome     ";

		System.out.println("Before triming string is" + s);

//Remove space

		System.out.println("After triming string is " + s.trim());

//charAt()

		s = "welcome";
		System.out.println(s.charAt(4)); // print of o

//contains()--> return boolean 
		System.out.println(s.contains("wel"));

		System.out.println(s.contains("comm"));

//comparing string equals()
		System.out.println(s.equals("welcome")); // true
		System.out.println(s.equals("Welcome"));// false
		System.out.println(s.equals("wel    come"));// false

//Replacing characters

		s = "welcome to Java";
		System.out.println(s.replace('o', 'i'));// welcime ti Java
		System.out.println(s.replace("Java", "Selenium")); // welcome to Selenium

//extracting substring from the main string

		s = "welcome";
		System.out.println(s.substring(0, 4));

//converting case 
		s = "WELCOME";
		System.out.println(s.toLowerCase()); // welcome

		s = "welcome";
		System.out.println(s.toUpperCase());// WELCOME

	}

}
