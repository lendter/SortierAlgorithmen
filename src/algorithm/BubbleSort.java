package algorithm;

import utilities.ArrayUtilities;

public class BubbleSort implements SortAlgorithm{
	private ArrayUtilities utilities;
	
	public BubbleSort() {
		this.utilities = new ArrayUtilities();
	}
	
	@Override
	public int[] sort(int[] array) {
		boolean isSwitched;
		do {
			isSwitched = false;
			for(int i = 0; i < array.length-1; i++) {
				if(array[i+1] < array[i]) {
					isSwitched = true;
					utilities.swap(array, i, i+1);
				}
			}
		}while(isSwitched);
		return array;
	}

}
