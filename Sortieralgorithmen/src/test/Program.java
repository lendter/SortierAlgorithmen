package test;

import algorithm.AlgorithmFactory;
import algorithm.AlgorithmType;
import algorithm.SortAlgorithm;
import utilities.ArrayUtilities;

public class Program {
	public static void main(String[] args) {
		ArrayUtilities utilities = new ArrayUtilities();
		
		//BubbleSort
		System.out.println("Bubble Sort:");
		int[] array1 = new int[10];
		utilities.fillArray(array1, 1, 30);
		System.out.println(utilities.printArray(array1));
		SortAlgorithm bubbleSort = AlgorithmFactory.getAlgorithm(AlgorithmType.BUBBLE);
		int[] bsSorted = bubbleSort.sort(array1);
		System.out.println("Result: "+ utilities.printArray(bsSorted));
		System.out.println();
		
		//SelectionSort
		System.out.println("Selection Sort:");
		SortAlgorithm selectionSort = AlgorithmFactory.getAlgorithm(AlgorithmType.SELECTION);
		
		int[] array2 = new int[10];
		utilities.fillArray(array2, 1, 30);
		System.out.println(utilities.printArray(array2));
		
		int[] ssSorted = selectionSort.sort(array2);
		System.out.println("Result: "+ utilities.printArray(ssSorted));
		System.out.println();
		
		//InsertionSort
		System.out.println("Insertion Sort:");
		SortAlgorithm insertionSort = AlgorithmFactory.getAlgorithm(AlgorithmType.INSERTION);
		
		int[] array3 = new int[10];
		utilities.fillArray(array3, 1, 30);
		System.out.println(utilities.printArray(array3));
		
		int[] isSorted = insertionSort.sort(array3);
		System.out.println("InsertionSort Result: "+ utilities.printArray(isSorted));
	}
}
