package grokking.sorting;

import java.util.LinkedList;
import java.util.Queue;

public   class HelperFunctions {
	
	public static  Queue<Integer> addArrayToQueue(Integer[] array) {
		Queue<Integer> queue = new LinkedList <Integer>();
		for (int i = array.length-1; i >= 0; i--){
		    queue.add(array[i]);
		}
		System.out.println("here");
		return queue;
	}
	
	public static void printQueue(Queue<Integer> queue) {
		while(!queue.isEmpty())
			System.out.println( queue.remove());
	}

	public static void printArray(Integer[] array) {
		for (int i = 0; i < array.length ; i++) {
			 System.out.println(array[i]);
		 }
	}

}
