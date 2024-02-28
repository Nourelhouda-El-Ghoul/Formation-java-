package part1;

public class Calculation {

	int x =10;
	int y = 20;
	
	
	//1/ case 1 : not tacking parameters and also not return any value 
	
	void sum() {
		
		System.out.println(x+y);
		
	}
	
	//2/ case 2 : not tacking parameters but returning value 
	
	
	int sum1() {
		
		return(x+y);
		
	}
	
	//3/ case 3 : taking parameters but not returning value
	
	void sum2(int a, int b) {
		System.out.println(a+b);
		
		
	}
	
	//4/ case 4 : taking parameters and also returning value 
	
	int sum3(int a, int b) {
		
		return a+b;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Calculation cal = new Calculation();
		cal.sum(); //case 1 //30
		
		int res = cal.sum1(); //case 2 //30
		System.out.println(res);
		
		cal.sum2(10,20);//case 3 //30
		
		System.out.println(cal.sum3(100, 200));//case 4 //300
		

	}

}
