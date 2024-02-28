package part3;

class Bike {

	final  void run() { //overriding 

		System.out.println("Running *************");

	}

}

class Honda extends Bike {
	void run() { //final keyword can not override the method  from class parent 

		System.out.println("Started************");
	}

}

public class FinalMathodDemo {

	public static void main(String[] args) {
		
		Honda hd = new Honda();
		hd.run();
		
		

	}

}
