package algorithm;

public class SelectionSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] < min) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
}

