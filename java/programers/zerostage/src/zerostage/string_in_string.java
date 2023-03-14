package zerostage;

//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
public class string_in_string {
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2="gg";
		solution(str1,str2);
	}

	public static void solution(String str1, String str2) {
		int answer = 0;
		if (str1.contains(str2)) {
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
	}

}
