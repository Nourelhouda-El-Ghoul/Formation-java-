package part1;

public class Student {

	int sId;
	String sName;
	char grade;

	// 2 Assign values to variables By using method

	void getValues(int id, String name, char g) {
		
		sId = id;
		sName = name;
		grade = g;
	}

	// 3 Assign values to variables By using constructor

Student( int id, String name, char g)  {
	
	sId = id; 
	sName = name; 
	grade = g;
}
void display()  {
	
	System.out.println(sId+" "+sName+ " "+grade);
}
	

}
