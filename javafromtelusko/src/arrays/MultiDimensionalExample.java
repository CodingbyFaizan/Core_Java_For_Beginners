package arrays;

import java.util.Iterator;

public class MultiDimensionalExample {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		
		System.out.println("Adding random values into it ... !");
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10);
			}
		}
		
		System.out.println();
		
		for(int x[] : arr) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
