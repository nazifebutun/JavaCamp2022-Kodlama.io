public class Main {

	public static void main(String[] args) {
		findNumber();

	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int find = 8;
		Boolean isThere = false;

		for (int i = 0; i < numbers.length; i++) {
			if (find == numbers[i]) {
				isThere = true;
				break;
			}
		}
		if (isThere == true) {
			System.out.println("The sought number is here.");
		} else {
			System.out.println("The sought number is not here.");
		}

	}

}
