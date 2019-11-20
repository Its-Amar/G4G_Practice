package com.gfg;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {

		/*
		 * Scanner s=new Scanner(System.in); 
		 * int t=s.nextInt(); 
		 * StringBuilder res=new StringBuilder();
		 */
		
		/*
		 * Input: 
		 * 		4 
		 * 		6 6 4 4 
		 * Output: 
		 * 		-8
		 */
		int[] input = {6,6,4,4};
		//int[] input = {1,2,3,1,3};
		int N = input.length;
		int sum = 0;
		//System.out.println(N);
		System.out.println(Arrays.toString(input));
		for (int i = N-1; i >=0; i--) {
			for(int j = i-1; j>=0; j--) {
				int temp = input[i] - input[j];
				//System.out.println(temp);
				sum = sum + temp;
			}
		}
		System.out.println(sum);
	}

}