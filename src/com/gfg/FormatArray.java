package com.gfg;

import java.util.Arrays;

public class FormatArray {

	public static void main(String[] args) {
		//5 4 3 2 1
		//int[] input = {5,4,3,2,1};
		int[] input = {5,4,3,2,6,1,1};
		for(int i = 0; i < input.length; i=i+2) {
			
			if(i < input.length-1) {
				if(input[i]>input[i+1]) {
					int temp = input[i];
					input[i] = input[i+1];
					input[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
