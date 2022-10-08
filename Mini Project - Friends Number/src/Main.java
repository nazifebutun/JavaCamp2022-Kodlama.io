public class Main {

	public static void main(String[] args) {
		int number1 = 220, number2 = 284, sum = 0, remainder = 0,sum2=0;
		
		for(int i=1; i<number1; i++) {
			remainder = number1 % i;
			if(remainder == 0) {
				sum += i;
			}	
		}//System.out.println(sum);
		for(int j=1; j<number2; j++) {
			remainder = number2 % j;
			if(remainder == 0) {
				sum2 += j;
			}
		}//System.out.println(sum2);
		if(sum == number2 && sum2== number1) {
			System.out.println("This two numbers are friends numbers.");
		}
		else {
			System.out.println("This two numbers are not friends numbers.");
		}
	}
}