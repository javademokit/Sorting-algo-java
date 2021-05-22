package com.sanchi.tutorial.algorithms.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] input = {5,2,8,9,4,3,2};
		
		sort(input);
		
		System.out.println("Output -- "+ Arrays.toString(input));

	}

	
	public static void sort(int[] original)
	{
		if(original.length <2)
		{
			return;
		}
		
		int mid = original.length/2;
	
		// create an array with start to mid and copy the elements
		int[] leftHalf = new int[mid];
		for(int i=0; i<mid; i++)
		{
			leftHalf[i] = original[i];
		}
		
		// create an array from mid+1 to end and copy the elements
		int[] rightHalf = new int[original.length - mid];
		for(int i=mid; i<original.length; i++)
		{
			rightHalf[i-mid] = original[i];
		}
		
		sort(rightHalf);
		sort(leftHalf);
		
		merge(leftHalf, rightHalf, original);
	}


	private static void merge(int[] leftHalf, int[] rightHalf, int[] original) {
		
		int rLength = rightHalf.length;
		int lLength = leftHalf.length;
		
		int i=0; 
		int j=0;
		int k=0;
		
		while(i<rLength && j<lLength)
		{
			if(rightHalf[i] <leftHalf[j])
			{
				// copy right half
				original[k++] = rightHalf[i++];
			}
			else
			{
				// copy left half
				original[k++] = leftHalf[j++];
			}
		}
		
		while(i<rLength)
		{
			original[k++] = rightHalf[i++];
		}
		
		while(j<lLength)
		{
			original[k++] = leftHalf[j++];
		}
	}
}

/*
1, 2, 3, 4, 5, 6, 7, 8 = 8 mid =4
1, 2, 3, 4, 5, 6, 7 mid = 3

*/
