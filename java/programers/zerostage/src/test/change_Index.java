package test;

import java.util.Arrays;

public class change_Index {

	public static void main(String[] args) {
		System.out.println(solution("hello", 1, 2));

	}

	public static String solution(String my_string, int num1, int num2) {
		String answer = "";
		char[] arr = new char[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			arr[i] = my_string.charAt(i);
		}
		char temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;

		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}
}
