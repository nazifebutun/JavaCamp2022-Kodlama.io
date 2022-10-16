public class FourOperations {
	int sum = 0, sub = 0, multi = 1, div = 1;

	public int sum(int... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}
		return sum;
	}

	public int substraction(int num1, int num2) {
		sub = num1 - num2;
		return sub;
	}

	public int multiplication(int... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			multi *= numbers[i];

		}
		return multi;
	}

	public int division(int num1, int num2) {
		div = num1 / num2;
		return div;
	}

}
