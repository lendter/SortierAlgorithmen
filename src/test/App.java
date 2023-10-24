package test;

import java.util.logging.Logger;

import algorithm.AlgorithmFactory;
import algorithm.AlgorithmType;
import utilities.ArrayUtilities;

public class App {
	
	private Logger logger;
	private ArrayUtilities utilities;
	
	public App() {
		logger = Logger.getLogger(this.getClass().getName());
		utilities = new ArrayUtilities();
	}
	
	public void run() {
		//BubbleSort
		logger.info("Bubble Sort:");
		int[] array1 = getRandomArray();
		sortArray(array1, AlgorithmType.BUBBLE);
		
		//SelectionSort
		logger.info("Selection Sort:");
		int[] array2 = getRandomArray();
		sortArray(array2, AlgorithmType.SELECTION);
		
		//InsertionSort
		logger.info("Insertion Sort:");
		int[] array3 = getRandomArray();
		sortArray(array3, AlgorithmType.INSERTION);
		
		//QuickSort
		logger.info("Quick Sort:");
		int[] array4 = getRandomArray();
		sortArray(array4, AlgorithmType.QUICK);
	}
	
	private int[] getRandomArray() {
		int[] array = new int[10];
		utilities.fillArray(array, 1, 30);
		logger.info(utilities.printArray(array));
		return array;
	}
	
	private void sortArray(int[] array, AlgorithmType algorithmType) {
		int[] sorted = AlgorithmFactory.getAlgorithm(algorithmType).sort(array);
		logger.info("Result: "+ utilities.printArray(sorted));
	}
}
