package com.simple.patterns;

import java.util.Scanner;

/**
 *			  * * * *
 *              * * *
 *                * *
 *                  * 
 *
 */
public class Pattern2 implements Patterns {

	public static void main(String[] args) {
		int nodes = 0;
		
		Scanner scan = new Scanner(System.in);
		nodes = scan.nextInt();
		
		new Pattern2().printPattern(nodes);
	}

	@Override
	public void printPattern(int noOfStars) {
		for (int i = noOfStars; i > 0; i--) {
			for(int k = noOfStars - i; k>0 ; k--){
				System.out.print(" ");
			}
			for(int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
