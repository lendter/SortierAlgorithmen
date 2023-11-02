package algorithm;

import utilities.ArrayUtilities;

public class SelectionSort implements SortAlgorithm {
	private ArrayUtilities utilities;
	
	public SelectionSort() {
		this.utilities = new ArrayUtilities();
	}
	
	
	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			utilities.swap(array, index, i);
		}
		return array;
	}

}
