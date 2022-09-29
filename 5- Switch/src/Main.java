public class Main {

	public static void main(String[] args) {
		char grade = 'f';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Perfect! Pass the course.");
			break;
		case 'B':
		case 'b':
			System.out.println("Great! Pass the course.");
			break;
		case 'C':
		case 'c':
			System.out.println("Good. Pass the course.");
			break;
		case 'D':
		case 'd':
			System.out.println("Fine. Pass the course.");
			break;
		case 'F':
		case 'f':
			System.out.println("Unfortunately. Fail the course.");	
			break;
		default :
			System.out.println("Your grade may be wrong!!!");
		}
	}
}