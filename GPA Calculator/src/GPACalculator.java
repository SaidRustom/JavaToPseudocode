import java.util.Scanner;
class GPACalculator {
	
	
	/**
	 * method main that gets user input for courses information
	 * and prints out total GPA
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int numberOfCourses;
		double totalHours =0;
		double GPA=0;
		int numOfHours;
		
		System.out.println("Enter number of courses: ");
		numberOfCourses = input.nextInt();
		Double courses[][] = new Double[numberOfCourses][3];
		Course course = new Course();
		
		/**
		 * Nested for loop to fill the dd array courses. 
		 * first column is reserved for course grade. (j=0)
		 * second column is reserved for course hours.(j=1)
		 * third column is reserved for grade * hours.(j=2)
		 */
	for(int i=0; i<numberOfCourses; i++) {
		course.reset();
		System.out.println("enter the grade for course #" + (i+1) + " :");
		 for (int j=0; j<3; j++) {
			 switch (j) {
			 case 0:
				  courses[i][j] = course.getGrade(); continue;
			 case 1:
				  courses[i][j] = course.getNumberOfHours(); continue;
			 case 2:
				 courses[i][j] = course.numberOfHours * course.numericGrade; continue;
			 }
		} 
		
		
		System.out.println("Numerical grade for course #" + (i+1) + " = " + courses[i][0]  );
		System.out.println("and total course hours = " + courses[i][1]);
		System.out.println("________________________");
		System.out.println();
		course.reset();
		 
	}
	/**
	 * gradeSum calculates the sum of all the 
	 * numbers in courses[x][2] (third column)
	 */
		double gradeSum = 0;
		for (int i =0; i<numberOfCourses; i++) {
				gradeSum = gradeSum + courses [i][2];
			}
		
		GPA = gradeSum / course.totalHours;
		System.out.println("total GPA = " + GPA);
		
	}
	
}
		
		
		
		
		
		
		
		
		




	
	


