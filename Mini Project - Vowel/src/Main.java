public class Main {

	public static void main(String[] args) {
		char letter = 'a';
		
		switch(letter) {
		case 'A' :
		case 'a' :
		case 'U' :
		case 'u' :
		case 'I' :
		case 'ı' :
		case 'O' :
		case 'o' :
			System.out.println("The letter is deep vowel voice.");
			break;
		default :
			System.out.println("The letter is thin vowel voice");
		}	
	}
}