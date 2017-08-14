package grokking;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SortingMain {

	public static void main(String[] args) {

		Integer[] array = {13,4,2,6,5,7,18,1,9,24};
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("Select a number");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Bubble Sort Optimised");
		System.out.println("3. Quicksort");
		System.out.println("4. Selection Sort");
		System.out.println("5. Merge Sort");
		System.out.println("6. Merge Sort Bottom Up ");
		System.out.println("7. Merge Sort Natural");
		System.out.println("8. Selection Sort");
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int myint = keyboard.nextInt();
		
		switch (myint) {
        case 1:
        	BubbleSort.sort(array);
        	System.out.println("BubbleSort");
        	printArray(array);
        	break;
        case 2:
        	BubbleSortOptimised.sort(array);
        	System.out.println("Bubble Sort Optimised");
        	printArray(array);
        	break;
        case 3:
        	Quicksort.sort(array);
        	System.out.println("Quick Sort");
        	printArray(array);
        	break;
        case 4:
        	SelectionSort.sort(array);
        	System.out.println("Selection Sort");
        	printArray(array);
        	break;
        case 5:
        	System.out.println("Merge Sort");
        	for (int i = array.length-1; i >= 0; i--){
                queue.add(array[i]);
            }
        	array = MergeSort.sort(array);
        	printArray(array);
        	break;
        case 6:
        	System.out.println("Merge Sort Bottom Up");
        	for (int i = array.length-1; i >= 0; i--){
                queue.add(array[i]);
            }
        	MergeSortBottomUp.sort(array);
        	printArray(array);
        	break;
        	
        case 7:
        	System.out.println("Merge Sort Natural");
        	for (int i = array.length-1; i >= 0; i--){
                queue.add(array[i]);
            }
            
            queue = MergeSortNatural.sort(queue);
        	printQueue(queue);
                
        	break;
        case 8:
        	MergeSort.sort(array);
			
		}
		
		 		
	}

	private static void printQueue(Queue<Integer> queue) {
		while(!queue.isEmpty())
			System.out.println( queue.remove());
	}

	private static void printArray(Integer[] array) {
		for (int i = 0; i < array.length ; i++) {
			 System.out.println(array[i]);
		 }
	}

}
