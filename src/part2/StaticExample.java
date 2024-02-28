package part2;

public class StaticExample {

	static int a = 10; // static variable
	int b = 20; // non static variable

	static void m1() {
		System.out.println("This is m1---static method");

		// Access to variable b directly --non static
		//creating object 
		StaticExample se = new StaticExample();
		System.out.println(se.b);

	}

	void m2() { // non static method

		System.out.println("This is m2--non static method");
	}

	void m3() { //non static method can access  directly both static and non static stuff (vbl/ method)

		System.out.println("This is m3--non static method");
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
		
	}

	public static void main(String[] args) {
		
 //static method can access directly only static stuff  --> without creating object 
		System.out.println(a);
		//System.out.println(StaticExample.a);//By className 
		
		m1();
		//StaticExample.m1();//By className 
		
		//m2();// incorrect  because m2 is not static method 
		//System.out.println(b); // incorrect because b is non sttaic variable 
		
		//static method can also access non static stuff but through object 
		StaticExample se = new StaticExample();
		System.out.println(se.b);
		se.m2();
		se.m3();
		
		
		
	}

}
