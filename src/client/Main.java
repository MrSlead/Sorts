package client;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import ArrayEnginer.ProcessingArray;
import ArrayEnginer.ProcessingArrayWork;
import algoritmic.SortArray;
import algoritmic.SortArrayInteger;



public class Main {
	public static void main(String [] args) throws IOException, InterruptedException {
		ProcessingArray delay = new ProcessingArrayWork();
		SortArray sortArray = new SortArrayInteger();
		int range = 50000;
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test.txt"))){	
			for(int i = 500; i <= 50000; i += 500) {
				//Integer [] array = new Integer[i]; // Bad way
				
				int array [] = new int[i];
				int N = 1;
				long mediumValueOperations = 0;
				
				long time = System.currentTimeMillis();
				for(int j = 0; j < N; j++) {
					//delay.fillArrayRandom(array, range); // medium event at N = 100
					//delay.fillArrayInAscendingOrder(array); // bad event at N = 1
					delay.fillArrayInDescendingOrder(array); // best event at N = 1
					
					sortArray.sortByShakerInteger(array); // Shaker sort
					//sortArray.sortByBubble(array); // Bubble sort
					//sortArray.sortByShell(array); // Shell sort
					mediumValueOperations += ((SortArrayInteger)sortArray).getCount();
				}
				
				bw.write(String.valueOf(mediumValueOperations / N));
				bw.newLine();
				System.out.println(i + " complited, time: " + (double)(System.currentTimeMillis() - time) / 1000);
				
			}
		}
	}
}
//System.out.println(Arrays.toString(array));
