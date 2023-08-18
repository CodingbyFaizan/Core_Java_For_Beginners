package arrays.problem1;

public class Client {
	public static void main(String[] args) {
		int[] numbers = { 5,8,2,10,3};
		int max = numbers[0];
		for(int x : numbers) {
			if(x > max) {
				max = x;
			}
		}
		System.out.println(max);
	}
}
