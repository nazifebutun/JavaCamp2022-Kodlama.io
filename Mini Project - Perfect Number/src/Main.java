public class Main {

	public static void main(String[] args) {
		int number = 496, remainder=0, sum=0;

		for (int i = 1; i < number; i++) {
			remainder = number % i;
			if(remainder ==0) {
				sum += i;	
			}
		}
		//System.out.println(sum);
		if(sum == number ) {
			System.out.println("The number is perfect number.");
		}
		else {
			System.out.println("The number is not perfect number.");
		}
	}
}