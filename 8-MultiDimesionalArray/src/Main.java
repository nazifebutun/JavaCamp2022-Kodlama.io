public class Main {

	public static void main(String[] args) {
		String [][] city = new String [3][3];
		city[0][0] = "istanbul";
		city[0][1] = "bursa";
		city[0][2] = "bilecik";
		city[1][0] = "ankara";
		city[1][1] = "konya";
		city[1][2] = "kayseri";
		city[2][0] = "diyarbakir";
		city[2][1] = "sanliurfa";
		city[2][2] = "gaziantep";
		
		for(int i=0; i<city.length;i++) {
			System.out.println("-------------------");
			for(int j=0; j<city.length; j++) {
				System.out.println(city[i][j]);
			}
		}
	}

}