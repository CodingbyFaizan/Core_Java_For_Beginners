package arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int num[] = new int[5];
		int arr[] = {1,2,3,4,5};
	
		System.out.println("Using normal for loop...");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		System.out.println("Using enhanced for loop...");
		for(int x : num) {
			System.out.print(x);
		}
		System.out.println();
		for(int x : arr) {
			System.out.print(x);
		}
		
		//adding random values using math library....
		System.out.println();
		System.out.println("After adding random values array will be ....");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 10);
		}
		System.out.println();
		for(int x : num) {
			System.out.print(x + " ");
		}
	}
}
