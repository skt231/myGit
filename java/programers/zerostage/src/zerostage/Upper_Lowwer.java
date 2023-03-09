package zerostage;

public class Upper_Lowwer {
	public static void main(String[] args) {
		String my_string="abcDe";
		solution(my_string);
	}

	public static void solution(String my_string) {
		String str = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (Character.isUpperCase(my_string.charAt(i))) {
				str += Character.toLowerCase(my_string.charAt(i));
			} else {
				str += Character.toUpperCase(my_string.charAt(i));
			}
		}
		System.out.println(str);
	}

}
