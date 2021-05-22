package com.sanchi.tutorial.algorithms.sort;

import java.util.Arrays;

/*		
 * Original array - 3, 2, 8, 1, 5, 4
 * lets say my Pivot is 4 , then all element lesser than 4 should be brought to left and greater than 4 should be on right.
 * 3,2,1,4,8,5
 * Now sort left section [3, 2, 1] and right section [8, 5]
 * Again find pivot for each section and perform the same operations
 * do this until the start<end , which means only one element in the section
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] input = {5,2,8,9,4,3,2};
		
		sort(input);
		
		System.out.println("Output -- "+ Arrays.toString(input));

	}
	
	/*
	 * some facts about quick sort
	 * 1. its a in place sort, therefore space complexity is O(1)
	 * 2. Time complexity in average case is O(nlogn)
	 * 3. Time complexity in worst case is O(n2)
	 */
	public static void sort(int[] original)
	{
		sort(original, 0, original.length -1);
	}

	private static void sort(int[] original, int start, int end) {
		
		if(start < end)
		{
			int pivotIndex = partition(original, start, end);
			sort(original, start, pivotIndex -1);
			sort(original, pivotIndex +1, end);
		}	
	}

	private static int partition(int[] original, int start, int end) {

		int partitionIndex = start;
		int pivot = original[end];
		
		for(int i=start; i<end; i++)
		{
			if(original[i] <= pivot)
			{
				// first swap then increment partition index
				// idea is to keep all element lesser than pivot on left.
				swap(original, i, partitionIndex);
				partitionIndex++;
			}
		}
		
		swap(original, partitionIndex, end);
		
		return partitionIndex;
	}
	
	private static void swap(int[] original, int index1, int index2)
	{
		int temp = original[index1];
		original[index1] = original[index2];
		original[index2] = temp;
	}
}



	

