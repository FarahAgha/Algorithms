package grokking;

import java.util.Scanner;

public class SortingMain {

	public static void main(String[] args) {

		Integer[] array = {13,4,2,6,5,7,18,1,9};
		
		System.out.println("Select a number");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Bubble Sort Optimised");
		System.out.println("3. Quicksort");
		System.out.println("4. Selection Sort");
		
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int myint = keyboard.nextInt();
		
		switch (myint) {
        case 1:
        	BubbleSort.sort(array);
        	System.out.println("BubbleSort");
        	break;
        case 2:
        	BubbleSortOptimised.sort(array);
        	break;
        case 3:
        	Quicksort.sort(array);
        	break;
        case 4:
        	SelectionSort.sort(array);
        	break;
			
		}
	
		
		 for (int i = 0; i < array.length ; i++) {
			 System.out.println(array[i]);
		 }
		
	}

}
