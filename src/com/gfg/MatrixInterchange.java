package com.gfg;

import java.util.Arrays;

public class MatrixInterchange {

	public static void main(String[] args) {
		
		
		
		/*
		 * T1
		 * Input:
			8 9 7 6
			4 7 6 5
			3 2 1 8
			9 9 7 7
		Output:
			6 9 7 8
			5 7 6 4
			8 2 1 3
			7 9 7 9
		*
		*T2
		*Input: 
			9 7 5 1
			2 3 4 1
			5 6 6 5
			1 2 3 1
			Output: 
			1 7 5 9
			1 3 4 2
			5 6 6 5
			1 2 3 1
		*/
		
		
		
		
		int [][] input = { 	
							{8,9,7,6},
							{4,7,6,5},
							{3,2,1,8},
							{9,9,7,7}
						  }; 
//		int [][] input = { 	
//							{9,7,5,1},
//							{2,3,4,1},
//							{5,6,6,5},
//							{1,2,3,1}
//						  }; 
		//Printing Input
		System.out.println("Input Array : ");
		for(int i = 0; i< input.length; i++) {
		System.out.println(Arrays.toString(input[i]));
		}
		
		//Logic
		for(int i = 0 ; i < input.length; i++) {
			for(int j = 0; j < 1; j++) {
				int temp = input[i][j];
				input[i][j]= input[i][input[i].length-1];
				input[i][input[i].length-1] = temp;
			}
		}
		
		//Printing Output
		System.out.println("Output Array : ");
		for(int i = 0; i< input.length; i++) {
		System.out.println(Arrays.toString(input[i]));
		}
		
	}

}
