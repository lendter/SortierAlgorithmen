package utilities;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayUtilities {
	private Random rndm;
	
	public ArrayUtilities() {
		this.rndm = new Random();
	}
	
	public int[] fillArray(int[] array, int lowerBound, int higherBound) {
		for(int i = 0; i < array.length; i++) {
			array[i] = rndm.nextInt(lowerBound, higherBound);
		}
		return array;
	}
	
	public double[] fillArray(double[] array, double lowerBound, double higherBound) {
		for(int i = 0; i < array.length; i++) {
			array[i] = rndm.nextDouble(lowerBound, higherBound);
		}
		return array;
	}
	
	public String printArray(double[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		sb.append(" sehr schoen, aber nicht gut");
		return sb.toString();
	}
	
	public String printArray(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		sb.append(" sehr schoen, aber nicht gut");
		return sb.toString();
	}
	
	public int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public double sum(double[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public double avg(int[] array) {
		return sum(array)/array.length;
	}
	
	public double avg(double[] array) {
		return sum(array)/array.length;
	}
	
	public int max(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			max = array[i] > max ? array[i] : max;			
		}
		return max;
	}
	
	public int maxIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				index = i;
				max = array[i];  
			}
		}
		return index;
	}
	
	public double max(double[] array) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			max = array[i] > max ? array[i] : max;			
		}
		return max;
	}
	
	public int min(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			min = array[i] < min ? array[i] : min;			
		}
		return min;
	}
	
	public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	public int minIndex(int[] array) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				index = i;
			}
			
		}
		return index;
	}
	
	public int[] popIndex(int[] array, int index) {
		int[] result = new int[array.length];
		for(int i = 0; i<= array.length; i++) {
			if(i != index) {
				result[i] = array[i];
			}
		}
		return result;
	}
	
	public double min(double[] array) {
		double min = Double.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			min = array[i] < min ? array[i] : min;			
		}
		return min;
	}
	
	public int modus(int[] array) {
		HashMap<Integer, Integer> modMap = new HashMap<>();
		for(int i = 0; i < array.length; i++) {
			if(modMap.containsKey(array[i])) {
				int count = modMap.get(array[i]) + 1;
				modMap.put(array[i], count);
			}else {
				modMap.put(array[i], 1);
			}
		}
		return Collections.max(modMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
	}
	
	public int modalWert(int[] array) throws Exception {
		if(min(array)< 0) {
			throw new Exception("Modalwert nicht ermittelbar. Bitte verwenden Sie modus()"); 
		}
		int length = max(array)+1;
		int[] modArray = new int[length];
		for(int i = 0; i < array.length; i++) {
			modArray[array[i]]++;
		}
		return maxIndex(modArray);
	}
	
	public double modus(double[] array) {
		double modusCurrentBest = array[0];
		int candidateCounter = 0, bestCount = 0;
		for (int i = 0; i < array.length; i++) {
			candidateCounter = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					candidateCounter++;
				}
			}
			if (candidateCounter > bestCount) {
				bestCount = candidateCounter;
				modusCurrentBest = array[i];
			}
		}
		System.out.println("Häufigkeit: " + bestCount);
		return modusCurrentBest;
	}
}
