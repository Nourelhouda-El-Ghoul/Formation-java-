package part3;

public class FinalVariableDemo {
	
	final int speed = 400;
	
	

	public static void main(String[] args) {
		
		FinalVariableDemo fd = new FinalVariableDemo();
		fd.speed = 40; //compile time error beacause of final 
		System.out.println(fd.speed);
		

	}

}
