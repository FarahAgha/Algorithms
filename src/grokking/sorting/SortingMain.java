package grokking.sorting;

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
		System.out.println("9. Insertion Sort");
		System.out.println("10. BucketSort Sort");
		System.out.println("11. Cocktail Sort");
		System.out.println("12. Comb Sort");
		System.out.println("13. Counting Sort");
		System.out.println("14. Gnome Sort");
		System.out.println("15. Heap Sort");
		System.out.println("16. Radix Sort");
		System.out.println("17. Odd Even Sort");
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int myint = keyboard.nextInt();
		
		switch (myint) {
        case 1:
        	BubbleSort.sort(array);
        	System.out.println("BubbleSort");
        	HelperFunctions.printArray(array);
        	break;
        case 2:
        	BubbleSortOptimised.sort(array);
        	System.out.println("Bubble Sort Optimised");
        	HelperFunctions.printArray(array);
        	break;
        case 3:
        	Quicksort.sort(array);
        	System.out.println("Quick Sort");
        	HelperFunctions.printArray(array);
        	break;
        case 4:
        	SelectionSort.sort(array);
        	System.out.println("Selection Sort");
        	HelperFunctions.printArray(array);
        	break;
        case 5:
        	System.out.println("Merge Sort");
        	//HelperFunctions.addArrayToQueue(array, queue);
        	array = MergeSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 6:
        	System.out.println("Merge Sort Bottom Up");
        	//HelperFunctions.addArrayToQueue(array, queue);
        	MergeSortBottomUp.sort(array);
        	HelperFunctions.printArray(array);
        	break;        	
        case 7:
        	System.out.println("Merge Sort Natural");
        	queue = HelperFunctions.addArrayToQueue(array); 
            queue = MergeSortNatural.sort(queue);
            HelperFunctions.printQueue(queue);                
        	break;
        case 8:
        	System.out.println("Selection Sort");
        	SelectionSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;        	
        case 9:
        	System.out.println("Insertion Sort");
        	InsertionSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 10:
        	System.out.println("Bucket Sort");
        	BucketSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;        	
        case 11:
        	System.out.println("Cocktail Sort");
        	CocktailSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 12:
        	System.out.println("Comb Sort");
        	CombSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 13:
        	System.out.println("counting Sort");
        	CountingSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 14:
        	System.out.println("Gnome Sort");
        	GnomeSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 15:
        	System.out.println("Heap Sort");
        	Heapsort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 16:
        	System.out.println("Radix Sort");
        	RadixSort.sort(array);
        	HelperFunctions.printArray(array);
        	break;
        case 17:
        	System.out.println("OddEven Sort");
        	OddEvenSort.sort(array);
        	HelperFunctions.printArray(array);     	
		}	 		
	}



	

}
