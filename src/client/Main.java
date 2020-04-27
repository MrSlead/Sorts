package client;

import java.util.Arrays;

import ArrayEnginer.ProcessingArray;
import ArrayEnginer.ProcessingArrayWork;
import algoritmic.SortArray;
import algoritmic.SortArrayWork;

public class Main {
	public static void main(String [] args) {
		ProcessingArray delay = new ProcessingArrayWork();
		SortArray sortArray = new SortArrayWork();
		
		int lengthArray = 50;
		int range = 1000;
		Integer array [] = new Integer[lengthArray];
		
		delay.fillArrayRandom(array, range);
		System.out.println(Arrays.toString(array));
		
		sortArray.sortByShakerInteger(array);
		System.out.println(Arrays.toString(array));
	}
}
