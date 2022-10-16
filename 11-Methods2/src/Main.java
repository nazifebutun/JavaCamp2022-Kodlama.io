public class Main {

	public static void main(String[] args) {
		String mesage = "The weather is very nice today.";
		String newMesage = mesage.substring(0, 2);
		System.out.println(mesage);
		System.out.println(newMesage);
		update(); // void method no need println.
		System.out.println(sum(15, 8));
		System.out.println(city());
	}

	public static void add() {
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static void update() {
		System.out.println("Updated.");
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static String city() {
		return "Ankara";
	}
}