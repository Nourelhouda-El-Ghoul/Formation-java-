package conditionalStatement;

public class JumpStatement {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i == 5)
			{
				//break; //1--4
				continue; //1--4 6--10
			}
			System.out.println(i);
		}
		
		
		
	}

}
