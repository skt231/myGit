package zerostage;

public class char_replace {

	public static void main(String[] args) {
		solution("ABCDE","B");
	}
	public static void solution(String my_string,String letter) {
		String answer="";
		answer=my_string.replace(letter, "");
		System.out.println(answer);
	}

}
