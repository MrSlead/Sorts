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
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\�����2\\Desktop\\��������.txt"))){	
			for(int i = 500; i <= 50000; i += 500) {
				//Integer [] array = new Integer[i]; // Bad way
				
				int array [] = new int[i];
				
				for(int j = 0; j < 1; j++) {
					//delay.fillArrayRandom(array, range); // ������� ������, ���� j <= 100
					//delay.fillArrayInAscendingOrder(array); // ��������� ������, ���� j < 1
					delay.fillArrayInDescendingOrder(array); // ��������� ������, ���� j < 1
					
					long time = System.currentTimeMillis();
					//sortArray.sortByShakerInteger(array); // ���������� ����������
					sortArray.sortByBubble(array);
					
					bw.write(String.valueOf(((SortArrayInteger)sortArray).getCount()));
					bw.newLine();
					System.out.println(i + " complited, time: " + (double)(System.currentTimeMillis() - time) / 1000);
				}
				
			}
		}
	}
}
