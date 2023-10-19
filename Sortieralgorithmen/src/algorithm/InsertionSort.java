package algorithm;

import utilities.ArrayUtilities;

public class InsertionSort implements SortAlgorithm {
	private ArrayUtilities utilities;

	public InsertionSort() {
		this.utilities = new ArrayUtilities();
	}

	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int temp = array[i + 1];
			if (temp < array[i]) {
					int j = i - 1;
					array[i + 1] = array[i];
					while (j >= 0 && array[j] > temp) {
						array[j + 1] = array[j];
						j--;
					}
					array[j + 1] = temp;
			}
		}
		return array;
	}

}
