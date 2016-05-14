package com.simple.patterns;

import java.util.Scanner;

public class Pattern1 implements Patterns{

	/**
	 *              * * * * *
	 *              * * *
	 *              * * 
	 *              *
	 * 
	 */
	public static void main(String[] args) {
		int nodes = 0;
		
		Scanner scan = new Scanner(System.in);
		nodes = scan.nextInt();
		new Pattern1().printPattern(nodes);
	}

	@Override
	public void printPattern(int noOfStars) {
		for(int i = noOfStars; i>0; i--){
			for(int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
