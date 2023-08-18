package string.stringbufferorstringbuilder;

public class Client {
	public static void main(String[] args) {
		StringBuffer sen1 = new StringBuffer("     My name is Faizan   ");
		StringBuilder sen2 = new StringBuilder("  My name is Ritesh   ");
		
		System.out.println(sen1.toString().trim());
		System.out.println(sen2.toString().trim());
		
		System.out.println(sen1.replace(sen1.indexOf("is"),sen1.indexOf("is")+1,"are"));
//		System.out.println(sen2.replace("is","are"));
		
		System.out.println(sen1.reverse());
		System.out.println(sen2.reverse());
		
		System.out.println(sen1.toString() == sen2.toString());
		
		
	}
}
