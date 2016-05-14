package com.simple.patterns;

import java.util.Scanner;

/**		
*						*
*					*		*
*				*		*		*
*			*		*		*		*
*/		

public class Pyramid { //implements Patterns
	
	public static void main(String[] args){
		int node = 0;
		
		Scanner scan = new Scanner(System.in);
		node = scan.nextInt();
		
		new Pyramid().printPattern(node);
	}
	
	public void printPattern(int node){
		boolean flag = true;
		for(int i = 1; i <=node; i++){
			 if(flag){
				for(int k = 1; k <= node - i; k++ ){
					System.out.print(" ");
				}
				flag = false;
			 }
				for(int j = 0; j < i; j++){
					System.out.print("*");
					System.out.print(" ");
				}
			System.out.println();
			flag = true;
		}
	}
}