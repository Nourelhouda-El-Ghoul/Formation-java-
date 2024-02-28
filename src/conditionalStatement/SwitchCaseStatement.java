package conditionalStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		int day = 12;
		switch (day) { // selon en fr

		case 1:
			System.out.println("Synday");
			break;


		case 2:
			System.out.println("Monday");
			break;


		case 3:
			System.out.println("Tuesday");
			break;


		case 4:
			System.out.println("Wednesday");
			break;


		case 5:
			System.out.println("Thursday");
			break;


		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		
		default:
			System.out.println("Invalid number of day");

		}

	}
}


