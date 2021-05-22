package com.sanchi.tutorial.algorithms;

import java.util.Arrays;

/**
 * Class to implement BubbleSort 
 * algorithm.
 * 
 * @author Sanchi
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] input = {5,2,8,9,4,3,2};
		
		input = sortArray(input);
		
		System.out.println("Output -- "+ Arrays.toString(input));

	}

	/**
	 * Method to sort an integer array.
	 * 
	 * @param input
	 * @return
	 */
	public static int[] sortArray(int[] input)
	{
		if(input == null || input.length <1)
		{
			return input;
		}
		
		int len = input.length;
		
		for(int i = len-1;i>0;i--) // this pointer is used to limit.
		{
			for(int j=0; j+1<=i ;j++) // this pointer is used to select two elements.
			{
				if(input[j]>input[j+1])// if previous is greater then swap.
				{
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		
		return input;
	}
}
