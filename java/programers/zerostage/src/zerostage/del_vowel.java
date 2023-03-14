package zerostage;

//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class del_vowel {

	public static void main(String[] args) {
		solution("abcde");

	}

	public static void solution(String my_string) {
		String answer = "";
		String[] vowel = { "a", "e", "i", "o", "u" };
		char[] stringArr = my_string.toCharArray();
		for (int i = 0; i < stringArr.length; i++) {
			if( my_string.contains(vowel[i])) {
				answer = my_string.replaceAll(vowel[i], "");
				my_string = answer;
			} else {
                answer =my_string;
            }
		}
        
        
        System.out.println(answer);
    }
}
