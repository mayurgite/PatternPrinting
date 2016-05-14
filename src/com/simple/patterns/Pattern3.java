package com.simple.patterns;

import java.util.Scanner;

public class Pattern3 implements Patterns{
	
	/**
	*			*
	*			* * 
    *			* * * 
	*			* * * *
	*
	*/
	
	public static void main(String[] args){
		int nodes = 0;
		
		Scanner scan = new Scanner(System.in);
		nodes = scan.nextInt();
		
		new Pattern3().printPattern(nodes);
	}
	
	public void printPattern( int nodes){
		for(int i = 1; i<=nodes; i++){
			for(int j = 1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
}