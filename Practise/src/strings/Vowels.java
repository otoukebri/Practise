package strings;

public class Vowels {

	public static void main(String[] args) {
		String str = "z";
		System.out.println(str.replaceAll("[^aeiou]", "").length());
	}

}
