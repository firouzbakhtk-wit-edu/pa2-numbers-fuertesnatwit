package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		/*
		 * Initializing Scanner + a b c vars
		 */
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		/*
		 * checking discrim
		 */
		double discrim = (b*b) - (4 * a * c);
		
		if(discrim < 0) {
			System.out.printf("Roots: imaginary%n");
		} else if(discrim == 0) {
			double root = -1 * b /(2 * a);
			System.out.printf("Root: %.2f%n", root);
		} else {
			double root1 = ((-1 * b)+ Math.sqrt(discrim))/(2 * a);
			double root2 = ((-1 * b)- Math.sqrt(discrim))/(2 * a); 
			
			if(root1 < root2) {
				System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
			} else {
				System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
			}
		}
		
		input.close();
	}

}
