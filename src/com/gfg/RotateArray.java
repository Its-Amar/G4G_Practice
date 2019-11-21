package com.gfg;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int elements = arr.length;
		int rotation = 3;
		int[] newArr = new int[elements];
		int j=0;
		int l=0;
		for(int i = rotation; i<elements; i++) {
			
			newArr[j] = arr[i];
			j++;
		}
		for(int k = rotation; k > 0; k--) {
			newArr[elements - k] = arr[l];
			l++;
		}
		System.out.println(Arrays.toString(newArr));
		
	}

}
