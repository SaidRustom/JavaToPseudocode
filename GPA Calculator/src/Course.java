import java.util.Scanner;
/**
 * class Course contains methods for type Course and is used in GPACalculator class.
 * @author Said
 *
 */
public class Course {
	Scanner input = new Scanner(System.in);
	
	int percentGrade= 0;
	double numericGrade;
	double numberOfHours;
	String letterGrade;
	double totalHours;
	
	/**
	 * this method asks the user to enter courseGrade.
	 * grade can be entered as percentage value (%)
	 * or letter value (A - F) and returns the numeric value ( out of 4).
	 * @return numericGrade
	 */
	public double getGrade() {
		if (input.hasNextInt()) {
			percentGrade = input.nextInt();
			if (percentGrade < 50) {
				letterGrade = "F";
			}else if ( 50 < percentGrade && percentGrade < 52){
				letterGrade = "D-";
			}else if (52 < percentGrade && percentGrade < 56 ) {
				letterGrade = "D";
			}else if (56 < percentGrade && percentGrade <59) {
				letterGrade = "D+";
			}else if (59 < percentGrade && percentGrade <62) {
				letterGrade = "C-";
			}else if (62 < percentGrade && percentGrade <66) {
				letterGrade = "C";
			}else if (66 < percentGrade && percentGrade <69) {
				letterGrade = "C+";
			}else if (69 < percentGrade && percentGrade <72) {
				letterGrade = "B-";
			}else if (72 < percentGrade && percentGrade <76) {
				letterGrade = "B";
			}else if (76 < percentGrade && percentGrade <79) {
				letterGrade = "B+";
			}else if (79 < percentGrade && percentGrade <84) {
				letterGrade = "A-";
			}else if (84 < percentGrade && percentGrade <89) {
				letterGrade = "A";
			}else if (89 < percentGrade && percentGrade <101) {
				letterGrade = "A+";
			}	
		}else {
			letterGrade = input.next();
		}
		if (letterGrade.equalsIgnoreCase("F")) {
			numericGrade = 0;
		}else if (letterGrade.equalsIgnoreCase("D-")) {
			numericGrade = 1;
		}else if (letterGrade.equalsIgnoreCase("D")) {
			numericGrade = 1.2;
		}else if (letterGrade.equalsIgnoreCase("D+")) {
			numericGrade = 1.4;
		}else if (letterGrade.equalsIgnoreCase("C-")) {
			numericGrade = 1.7;
		}else if (letterGrade.equalsIgnoreCase("C")) {
			numericGrade = 2;
		}else if (letterGrade.equalsIgnoreCase("C+")) {
			numericGrade = 2.3;
		}else if (letterGrade.equalsIgnoreCase("B-")) {
			numericGrade = 2.7;
		}else if (letterGrade.equalsIgnoreCase("B")) {
			numericGrade = 3;
		}else if (letterGrade.equalsIgnoreCase("B+")) {
			numericGrade = 3.3;
		}else if (letterGrade.equalsIgnoreCase("A-")) {
			numericGrade = 3.6;
		}else if (letterGrade.equalsIgnoreCase("A")) {
			numericGrade = 3.8;
		}else if (letterGrade.equalsIgnoreCase("A+")) {
			numericGrade = 4;
		}
		return numericGrade;
		}
	/**
	 * Method reset() resets the value of variables to default.
	 */
	public void reset() {
		numberOfHours=0;
		percentGrade=0;
		numericGrade=0;
		letterGrade = null;
	}
	/**
	 * asks user to enter course hours, takes course hours as input
	 * and adds courseHours value to totalHours.
	 * @return numberOfHours
	 */
	public double getNumberOfHours() {
		System.out.println("enter total course hours");
		numberOfHours = input.nextInt();
		input.nextLine();
		totalHours = totalHours + numberOfHours;
		return numberOfHours;
	
	}
	/**
	 * getter for numericGrade.
	 * @return numericGrade
	 */
	public double getNumbericGrade() {
		return numericGrade;
	}
	
}
