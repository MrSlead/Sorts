package ArrayEnginer;

import java.util.Arrays;
import java.util.Collections;

public class ProcessingArrayWork implements ProcessingArray {

	public void fillArrayRandom(Integer[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50000);
		}
	}

	public void fillArrayInAscendingOrder(Integer[] array) {
		fillArrayRandom(array);
		Arrays.sort(array);
		
	}

	public void fillArrayInDescendingOrder(Integer[] array) {
		fillArrayRandom(array);
		Arrays.sort(array, Collections.reverseOrder());	
	}

}
