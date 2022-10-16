public class Main {

	public static void main(String[] args) {
		
		System.out.println(sum(5, 6, 69, 10, 5, 19, 35, 96, 108));
	}
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}