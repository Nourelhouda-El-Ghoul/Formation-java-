package part2;

public class MethodOverloading {

	// same name of method- different parameters/different dataTypes
	void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	void add(int a, double b) {
		
		System.out.println(a+b);
	}
	void add(double a, double b) {
		
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20);
		mo.add(10, 20.5);
		mo.add(10.5, 20.5);
		mo.add(10, 20, 30);
		
		// overloading technic applied on methods --> same name /different parametrs / different data type 
		//overloading --> save memory /save time 
		
	}

}
