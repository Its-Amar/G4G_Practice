package com.gfg;

import java.util.Arrays;

public class NextGreatest {

	public static void main(String[] args) {
		
		/*
		 * Input: 
		 * 2 
		 * 6 
		 * 16 17 4 3 5 2 
		 * 4 2 3 1 9
		 * 
		 * Output: 
		 * 17 5 5 5 2 -1 
		 * 9 9 9 -1
		 */
		//int[] input = {16,17,4,3,5,2};
		int[] input = {4,2,3,1,9};
		
		for(int i=0; i < input.length-1; i++) {
			int max=0;
			for(int j = i+1; j < input.length; j++) {
				int temp = input[j];
				
				if(temp>max) {
					max = temp;
				}
			}
			input[i] = max;
		}
		input[input.length - 1] = -1;
		System.out.println(Arrays.toString(input));
		
		
	}

}
