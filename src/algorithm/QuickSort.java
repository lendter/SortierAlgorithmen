package algorithm;

import utilities.ArrayUtilities;

public class QuickSort implements SortAlgorithm{

	private ArrayUtilities utilities;
	
	public QuickSort() {
		this.utilities = new ArrayUtilities();
	}
	
	@Override
	public int[] sort(int[] array) {
		quickSort(array, 0, array.length-1);
		return array;
	}

	private int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                utilities.swap(arr, i, j);
            }
        }
        utilities.swap(arr, i + 1, high);
        return (i + 1);
    }
	
	
    private void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	
}
