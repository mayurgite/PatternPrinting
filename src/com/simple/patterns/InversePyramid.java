package com.simple.patterns;

import java.util.Scanner;
/**
 * 			* * * *
 *			 * * *	 			
 * 			  * *
 * 			   *
 * */
public class InversePyramid implements Patterns {

	public static void main(String[] args) {
		int node = 0;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		node = scan.nextInt();
		
		new InversePyramid().printPattern(node);
	}
	
	@Override
	public void printPattern(int noOfStars) {
		for(int i = noOfStars; i > 0; i--){
			for(int j = 0; j< noOfStars - i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
