package algorithm;

public class SelectionSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] array) {
		if(array.length > 0) {
			for(int index = 0; index < array.length; index++) {
				int minPosVal = array[index];
				int newPosVal = minPosVal;
				int newPos = index;
				for(int i = index; i < array.length; i++) {
					if(array[i] < newPosVal) {
						newPosVal = array[i];
						newPos = i;
					}
				}
				array[index] = newPos;
				array[newPos] = minPosVal;
			}
		}
		return array;
	}
	
}

