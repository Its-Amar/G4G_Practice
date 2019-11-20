package com.gfg;

public class MaxInStructArray {

	public static void main(String[] args) {
		
		/*
		 * Input: 
		 * 2 
		 * 2 
		 * 1 2 2 1 -> 14, 25
		 * 
		 * 4 
		 * 3 5 7 9 5 6 5 5 -> 41, 93, 66, 65
		 * 
		 * Output: 
		 * 25 
		 * 93
		 * 
		 * Explanation: Testcase 1: (1, 2) and (2, 1) are respective given heights.
		 * After converting both heigths in to inches, we get 14 and 25 as respective
		 * heights. So, 25 is the maximum height.
		 */
		
		//int[] input = {1,2,2,1};
		int[] input = {3,5,7,9,5,6,5,5};
		int max = 0;
		 
		for(int i=0; i < input.length; i=i+2) {
			
			int height = input[i]*12 + input[i+1];
			//System.out.println("Height: "+height);
			
			if(height>=max) {
				max=height;
				//System.out.println(max);
			}
		}
		System.out.println(max);
	}

}
