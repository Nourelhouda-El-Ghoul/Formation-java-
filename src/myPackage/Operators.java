package myPackage;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		//Arithmetic operators --> + - * %
		
		System.out.println("---------------Arithmetic operators---------------------");
		System.out.println("The sum of a and b is :" +(a+b));//+(a+b) concatination
		System.out.println("The difference between a and b is " +(a-b));//without () will not do concat 
		
	//Relational operators --> == <> <= >= !=
		
		//Always return booelan value
		
		System.out.println("----------------Relational Operators----------------");
		System.out.println(a==b); //false
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a != b);//true
		
		
		
		//Logical operators -->&& || !
		//work always between boolean 
		boolean x = true; //1
		boolean y = false; //0
		
		System.out.println("----------Logical Operators-------------");
		System.out.println(x && y); //false //&& *
		System.out.println(x || y); //true //|| +
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		
		// Increment /Decrement operations ++/ --
		
		System.out.println("----------------- Increment Decrement Operations-----------------------");
		
		a = 10;
		a++;//Incrementation  a = a+1; a+=1;
		System.out.println(a);
		b = 5;
		b = b-1;// b--;
		System.out.println(b);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
