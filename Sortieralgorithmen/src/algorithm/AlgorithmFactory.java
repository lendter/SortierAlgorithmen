package algorithm;

public class AlgorithmFactory {

	public static SortAlgorithm getAlgorithm(AlgorithmType type) {
		switch (type) {
		case BUBBLE:
			return new BubbleSort();
		case INSERTION:
			return new InsertionSort();
		case QUICK:
			return new QuickSort();
		case SELECTION:
			return new SelectionSort();
		default:
			return null;
		}
	}
}
