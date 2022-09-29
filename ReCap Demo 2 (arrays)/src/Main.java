public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2, 1.3, 4.3, 5.6};
		double sum = 0;
		double biggest=0;
		for(int i=0;i<myList.length;i++) {
			
			System.out.println(myList[i]);
			sum = sum + myList[i];
			
			if(biggest<myList[i]) {
				biggest = myList[i];
			}
		}
		System.out.println("The sum is "+sum);
		System.out.println("The biggest number is "+biggest);
	}

}