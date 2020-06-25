package ObjectsBasics;

public class ObjectsBasics extends StudentsInfo {

	public static void main(String[] args) {
		
		System.out.println("***********************************************************************************************");	
		StudentsInfo firstStudent = new StudentsInfo();
					 firstStudent.setProrerties(-10.3f, (byte)5);
					 firstStudent.sayAbout();
		
		System.out.println();
		System.out.println("***********************************************************************************************");	
		System.out.println();

		StudentsInfo secondStudent = new StudentsInfo();
					 secondStudent.setProrerties(10.0f, (byte)3);
					 secondStudent.sayAbout();
		
		System.out.println();
		System.out.println("***********************************************************************************************");	
		System.out.println();

		StudentsInfo thirdStudent = new StudentsInfo();
					 thirdStudent.setProrerties(6.4f, (byte)3);
					 thirdStudent.sayAbout();
		
		System.out.println();
		System.out.println("***********************************************************************************************");	
		System.out.println();

	}

}
