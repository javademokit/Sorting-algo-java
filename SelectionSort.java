package com.sanchi.tutorial.algorithms;

import java.util.Arrays;

/**
 * Class to implement selection sort
 * algorithm.
 * 
 * @author Sanchi
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] input = { 5, 2, 8, 9, 4, 3, 2 };

		input = sortArray(input);

		System.out.println("Output -- " + Arrays.toString(input));
	}

	/**
	 * Method to sort an integer array.
	 * 
	 * @param input
	 * @return
	 */
	public static int[] sortArray(int[] input) {
		
		if(input == null || input.length <1)
		{
			return input;
		}
		
		int len = input.length;
		
		for(int i=0; i<len-1; i++) // this pointer is used to split the array into sorted and unsorted section.
		{
			int minIdx = i;
			for(int j=i+1; j<len; j++)
			{
				if(input[j]<input[minIdx])
				{
					minIdx = j;
				}
			}
			
			
			if(i!=minIdx)
			{
				int temp = input[i];
				input[i] = input[minIdx];
				input[minIdx] = temp;
			}
		}
		
		return input;
	}
	
}
