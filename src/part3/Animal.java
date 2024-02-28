package part3;

public class Animal {
	// 1
	String color = "White";

	// 2
	void eating() {

		System.out.println("Eating***************");//Overrinding : same name different body 
	}

	// 3
	Animal() { // constructor
		System.out.println("Animal is created");
	}

}

class Dog extends Animal{
	
	String color = "Black";
	
	Dog() { //constructor 
		super();

		System.out.println("Dog is created");
		
	}
	
	void displayColor() {
		System.out.println(color); //Black
		System.out.println(super.color); //White 
		
	}
	
	void eating() {
		
		System.out.println("Eating bread*********"); //Overrinding : same name different body 
		super.eating();
	}
	
	
	
	
	
	
	
}