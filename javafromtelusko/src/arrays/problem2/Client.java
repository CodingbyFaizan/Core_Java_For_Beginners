package arrays.problem2;

public class Client {
	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
		};
		
		int sum = 0;
		
		for(int[] x : matrix) {
			for(int y : x) {
				sum += y;
			}
		}
		
		System.out.println(sum);

	}
}
