package part1;

public class EmployeeMain {

	public static void main(String[] args) {

		// Creating object // is an instance of class 
		
		
		Employee empl = new Employee();
		empl.eId = 100;
		empl.eName = "Omar";
		empl.job = "Test Auto";
		empl.eDept = 10;
		empl.sal = 80.00;
		empl.display();
		
		
		
		
		//Creating object 2
		Employee empl2 = new Employee();
		empl.eId = 103;
		empl.eName = "Ahmed";
		empl.job = "Test Manager";
		empl.eDept = 12;
		empl.sal = 90.00;
		empl.display();
		
		
		
		
	}

}
