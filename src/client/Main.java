package client;

import java.util.Arrays;

import ArrayEnginer.ProcessingArray;
import ArrayEnginer.ProcessingArrayWork;

public class Main {
	public static void main(String [] args) {
		ProcessingArray delay = new ProcessingArrayWork();
		
		Integer array [] = new Integer[50];
		
		delay.fillArrayRandom(array);
		System.out.println(Arrays.toString(array));
		
		delay.fillArrayInAscendingOrder(array);
		System.out.println(Arrays.toString(array));
		
		delay.fillArrayInDescendingOrder(array);
		System.out.println(Arrays.toString(array));
	}
}
