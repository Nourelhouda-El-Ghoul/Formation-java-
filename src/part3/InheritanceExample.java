package part3;

class A { // Parent

	int a;

	void display() {
		System.out.println(a);
	}

}

class B extends A { // class is collection of variable and method
	int b;

	void print() {
		System.out.println(b);
	}

}

class C extends B {
	int c;

	void show() {

		System.out.println(c);
	}

}

public class InheritanceExample {

	public static void main(String[] args) {

		// Single

		A aobj = new A();
		aobj.a = 100;
		aobj.display();

		B bobj = new B();
		bobj.b = 20;
		bobj.a = 10;
		bobj.print();
		bobj.display();

		// Multilevel

		C cobj = new C();
		cobj.c = 70;
		cobj.show();
		cobj.b = 60;
		cobj.print();
		cobj.a = 50;
		cobj.display();

	}

}
