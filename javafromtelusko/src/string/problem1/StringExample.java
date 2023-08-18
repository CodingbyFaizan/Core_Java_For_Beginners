package string.problem1;

public class StringExample {
	public static void main(String[] args) {
		String sentence = "My Name is Faizan!";
		
		String words[] = sentence.split(" ");
		
		int count = words.length;
		
		System.out.println(count);
	}
}
