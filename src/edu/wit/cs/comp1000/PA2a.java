package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		/*
		 * Initializing Scanner + Vars for holding
		 */
		Scanner input = new Scanner(System.in);
		int posCount = 0;
		int negCount = 0;
		int posSum = 0;
		int negSum = 0;
		double posAvg = 0;
		double negAvg = 0;

		System.out.printf("Enter five whole numbers: ");
	/*
	 * FIRST NUMBER
	 */
		int a = input.nextInt();
		if(a > 0) {
			posCount++;
			posSum = posSum + a;
		} else {
			negCount++;
			negSum = negSum + a;
		}
	/*
	 * SECOND NUMBER
	 */
		int b = input.nextInt();
		if(b > 0) {
			posCount++;
			posSum = posSum + b;
		} else {
			negCount++;
			negSum = negSum + b;
		}
	/*
	 * THIRD NUMBER
	 */
		int c = input.nextInt();
		if(c > 0) {
			posCount++;
			posSum = posSum + c;
		} else {
			negCount++;
			negSum = negSum + c;
		}
	/*
	 * FOURTH NUMBER 
	 */
		int d = input.nextInt();
		if(d > 0) {
			posCount++;
			posSum = posSum + d;
		} else {
			negCount++;
			negSum = negSum + d;
		}
	/*
	 * FIFTH NUMBER
	 */
		int e = input.nextInt();
		if(e > 0) {
			posCount++;
			posSum = posSum + e;
		} else {
			negCount++;
			negSum = negSum + e;
		}
		
	/*
	 * Developing averages and whole number sum
	 */
		int sum = a + b + c + d + e;
		double avg= sum/ 5.0;
		if(posCount > 0) {
			posAvg = (double)posSum/posCount;
		}
		if(negCount > 0) {
			negAvg = (double)negSum/negCount;
		}
		
	/*
	 * PRINTING & DETERMINING WHICH MESSAGE TO SEND
	 */
		
		if(posCount == 1) {
			System.out.printf("The sum of the %d positive number: %d%n", posCount, posSum); 
		} else {
			System.out.printf("The sum of the %d positive numbers: %d%n", posCount, posSum); 
		}
		
		if(negCount == 1) {
			System.out.printf("The sum of the %d non-positive number: %d%n", negCount, negSum);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", negCount, negSum);
		}
		
		System.out.printf("The sum of the 5 numbers: %d%n", sum);
		/*
		 * AVG OF POS NUMBERS
		 */
		if(posCount == 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", posCount, posAvg);
		} else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", posCount, posAvg);
		}
		
		/*
		 * AVG OF NEG NUMBERS
		 */
		if(negCount == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", negCount, negAvg);
		} else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", negCount, negAvg);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", avg);
		
		
		input.close();
	}

}
