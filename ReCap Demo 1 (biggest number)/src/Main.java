public class Main {

	public static void main(String[] args) {
		int num1 = 20,
			num2 = 25,
			num3 = 2;
		if (num1>num2) {
			if (num1>num3) {
				System.out.println("Biggest number is "+ num1);
			}	
		}else if(num2>num3) {
			System.out.println("Biggest number is "+ num2);
		}
		else {
			System.out.println("Biggest number is "+ num3);
		}
	}
}