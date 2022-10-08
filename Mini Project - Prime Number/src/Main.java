public class Main {

	public static void main(String[] args) {
		int number = 37, remainder=0;
		
		for (int i = 2; i < number; i++) {
			remainder = number % i;
			if(remainder == 0) {
				System.out.println("The number is not prime number.");
				break;	
			}
		}
		if(remainder != 0) {
			System.out.println("The number is prime number.");	
		}	
		else if(number == 2) {
			System.out.println("The number is prime number.");		
		}
		else if(number == 1) {
			System.out.println("The number is not prime number.");		
		}
	}
}