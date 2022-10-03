public class Main {

	public static void main(String[] args) {
		String mesage = "The weather is very nice today.";
		char [] characters = new char[3];
		System.out.println(mesage);
		
		System.out.println("The message dimesional is "+mesage.length());
		System.out.println("5. member is "+mesage.charAt(4));   // charAt function
		System.out.println(mesage.concat(" Finally!!!"));
		System.out.println(mesage.startsWith("T"));
		System.out.println(mesage.endsWith("y"));
		
		mesage.getChars(0, 3, characters, 0);
		System.out.println(characters);
		
		System.out.println(mesage.indexOf("e"));
		System.out.println(mesage.lastIndexOf("e"));   // sondaki "e"nin baştan itibaren indexini verir.
       
		
		System.out.println(mesage.replace(' ', '*'));  // boşluk yerine * getirdik
		System.out.println(mesage.substring(4));   // 3. indexten itibaren yazdırır
		System.out.println(mesage.substring(4,11));  //belli bir aralıktaki kelimeyi yazdırır
		
		for(String word : mesage.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(mesage.toLowerCase());
		System.out.println(mesage.toUpperCase());
		
		System.out.println(mesage.trim());   // stringin başında ve sonunda olan boşlukları siler	
	}
}