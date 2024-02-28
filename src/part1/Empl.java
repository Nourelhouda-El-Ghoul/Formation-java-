package part1;

public class Empl {

	int eId;
	String eName;
	double sal;
	int deptNo;
	String job;

	void display() {

		System.out.println(eId);
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(deptNo);
		System.out.println(job);

	}

	public static void main(String[] args) {

		//Creating object 1
		
		Empl empl = new Empl();
		empl.eId =101;
		empl.eName = "Jihene";
		empl.job = "Test Automation";
		empl.sal = 80.00;
		empl.deptNo = 10;
		empl.display();
		
		//Creating object 2
		
				Empl emp2 = new Empl();
				empl.eId =102;
				empl.eName = "Fatima";
				empl.job = "Test Manager";
				empl.sal = 90.00;
				empl.deptNo = 12;
				empl.display();
				
		
		
	}

}
