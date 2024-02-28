package part3;

class Parent {

	int a;

	void display() {
		System.out.println(a);
	}

}

class Child1 extends Parent {

	int x;

	void show() {
		System.out.println(x);
	}
}

class Child2 extends Parent {
	int y;

	void print() {
		System.out.println(y);
	}

}

public class HierrarchicalInheritance {

	public static void main(String[] args) {
		
		
		Child1 ch1 = new Child1();
		ch1.x = 100;
		ch1.show();
		ch1.a = 200;
		ch1.display();
		
		
		Child2 ch2 = new Child2();
		ch2.y = 10;
		ch2.print();
		ch2.a = 20;
		ch2.display();
		
		

	}

}
