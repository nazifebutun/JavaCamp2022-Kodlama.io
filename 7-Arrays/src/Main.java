public class Main {

	public static void main(String[] args) {
		String student1= "naz";
		String student2= "eren";
		String student3= "hatice";
		String student4= "arzu";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println();
		
		String [] students = new String[4];
		students[0]= "eren";
		students[1]= "naz";
		students[2]= "hatice";
		students[3]= "arzu";
		
		for(int i=0; i<students.length;i++) { // length say that array length
			System.out.println(students[i]);
		}
		
		System.out.println();
		for(String student:students) {
			System.out.println(student);
		}
		
		
	}

}
