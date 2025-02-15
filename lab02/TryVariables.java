/////////////////////////////////////////////////////////////////////
//Lab Exercises No.2
//Accelerated Introduction to Computer Science Fall 2023
//Course CS 201 02
//Student: Harlee Ramos
//Due Date: 09/08/2023
/////////////////////////////////////////////////////////////////////

//PROBLEM 1 TRY VARIABLES

public class TryVariables {
	
	// This example shows how to declare and initialize variables
	public static void main( String [] args ) {
		int testGrade = 100;
		long cityPopulation = 425612340;
		byte ageInYears = 19;
		float  salesTax = .05F;		// the trailing F makes a float numeric literal

		//correction add ; at the end of the line
		double interestRate = 0.725;
		double avogadroNumber = 602214076000000000000000.;
		char finalGrade = 'A';
		boolean isEmpty = true;

		System.out.println( "testGrade is " + testGrade );
		System.out.println( "cityPopulation is " + cityPopulation );
		System.out.println( "ageInYears is " + ageInYears );
		System.out.println( "salesTax is " + salesTax );

		//correction change , to .
		System.out.println( "interestRate is " + interestRate );
		System.out.println( "avogadroNumber is " + avogadroNumber );
		System.out.println( "finalGrade is " + finalGrade );
		System.out.println( "isEmpty is " + isEmpty );
	}
}