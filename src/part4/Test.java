package part4;

interface A {
	int a = 10; // By default variable in interface are static and final

	void m1(); //Abstract method (without implementation of code) by default public 
}

class B {
	int b;

}

public class Test extends B implements A {
	//Here we implement the method 
	public void m1() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {

		//Here we can access to the method 
		Test test = new Test();
		test.m1();	
		
	}

}
