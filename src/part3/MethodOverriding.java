package part3;

class Bank {

	// same name
	double interrestRate() {
		return 0;
	}

}

class Bh extends Bank {
// same name 
	double interrestRate() {

		return 10.5;
	}

}

class Biat extends Bank {

	// same name
	double interrestRate() {

		return 9.5;
	}

}

class Attijeri extends Bank {

	// same name
	double interrestRate() {
		return 8.5;
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

		Bh bh = new Bh();
		System.out.println(bh.interrestRate());

		Biat biat = new Biat();
		System.out.println(biat.interrestRate());
		
		Attijeri attijeri = new Attijeri();
		System.out.println(attijeri.interrestRate());

	}

}
