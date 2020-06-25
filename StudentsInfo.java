package ObjectsBasics;

public class StudentsInfo {

	float avgMark;
	byte grade;
	boolean approved;
	
	void setProrerties(float avgMark, byte grade) {
		
		this.avgMark = avgMark;
		this.grade = grade;
				
		if ((avgMark >= 0.01)&&(avgMark <= 10.00)) {
				
			System.out.println("The average mark is: " + avgMark);
			
		} else {
				
			System.out.println("Your entry [" + avgMark + "] is not valid. The value must be between 1 and 10. Please enter a valid average mark.");
				
		}

		if ((grade >= 0)&&(grade <= 5)) {
				
			System.out.println("The grade is: " + grade);
			
		} else {
				
			System.out.println("Your entry [" + grade + "] is not valid. The value must be between 0 and 5. Please enter a valid value for the grade.");
		
			}

		if ((avgMark >= 0.01)&&(avgMark <= 5.00)) {
				
			approved = false;
			System.out.println("I'm not approved...I have to repeat the course.");
			
		} else if ((avgMark >= 5)&&(avgMark <= 10.00)) {
			approved = true;
			System.out.println("I'm approved. I can continue studying.");
		}
		
		else {
				
			approved = false;
			System.out.println("My average mark is invalid...I have to change its value in order to be approved.");
			
			}
		
	}
	
	void sayAbout() {
		System.out.println("I am the " + grade + " grade student.");

		System.out.println("");
		
		if ((avgMark >= 1.0) && (avgMark < 5.0)) {
			System.out.println("I'm very weak...I have to repeat the course.");			
		}   else if ((avgMark >= 5.0) && (avgMark < 7)) {
			System.out.println("I can continue studying, but I have to work harder!");
		} else if ((avgMark >= 7.0) && (avgMark < 9.0)) {
			System.out.println("I'm not bad, but I have what to strive for...");
		} else if ((avgMark >= 9.0) && (avgMark < 10.0)) {
			System.out.println("I'm are a good student, I'll continue studying the same way!");
		} else if (avgMark == 10){
			System.out.println("Excelent! I'm the best student!");
		} else {
			System.out.println("The average mark is invalid! Please change it.");
		}
				
	}
}
