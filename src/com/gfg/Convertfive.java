package com.gfg;

import java.util.Arrays;

public class Convertfive {

	public static void main(String[] args) {
		
		int[] input = {1,0,0,4};
		//int[] input = {1,2,1};
		
		for(int i = 0 ; i < input.length; i++) {
			if(input[i]==0) {
				input[i]=5;
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
