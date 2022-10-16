public class Main {

	public static void main(String[] args) {
		int multi, sum, sub, div;
		FourOperations fouroperations = new FourOperations();
		
		multi = fouroperations.multiplication(5, 6, 8, 1);
		System.out.println(multi);
		
		sum = fouroperations.sum(10, 8, 6, 5);
		System.out.println(sum);
		
		sub = fouroperations.substraction(56, 25);
		System.out.println(sub);
		
		div = fouroperations.division(86, 2);
		System.out.println(div);
	}
}