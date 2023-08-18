package string.stringmethods;

public class StringMethodsExample {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.substring(2,3));
		System.out.println(str1.indexOf("llo"));
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str1.concat("World!"));
		String concatstr = str1.concat("World!");
		System.out.println(concatstr);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.contains("World"));
		
		String sub = str1.substring(3);
		System.out.println(sub);
		
		System.out.println("----------");
		String sen = "My name is Faizan";
		String[] words = sen.split(" ");
		
		for(String x : words) {
//			System.out.println(x.length());
			System.out.println(x);
		}
		
		System.out.println("------------");
		String test = "       Hello World      ";
		String sentrim = test.trim();
		System.out.println(sentrim);
		
		System.out.println(str1.replace("He","Hi"));
		
		
	}
}
