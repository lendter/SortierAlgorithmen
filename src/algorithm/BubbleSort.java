package algorithm;

public class BubbleSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] array) {
		boolean isSwitched;
		do {
			isSwitched = false;
			for(int i = 0; i < array.length-1; i++) {
				if(array[i+1] < array[i]) {
					isSwitched = true;
					int val = array[i+1];
					array[i+1] = array[i];
					array[i] = val;
				}
			}
		}while(isSwitched);
		return array;
	}

}
