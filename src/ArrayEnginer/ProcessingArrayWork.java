package ArrayEnginer;


public class ProcessingArrayWork implements ProcessingArray {

	public void fillArrayRandom(Integer[] array, int range) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * range);
		}
	}

	public void fillArrayInAscendingOrder(Integer[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
	}

	public void fillArrayInDescendingOrder(Integer[] array) {
		for(int i = array.length - 1; i >= 0; i--) {
			array[i] = i;
		}
	}

}
