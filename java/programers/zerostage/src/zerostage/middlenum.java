package zerostage;

import java.util.Arrays;

public class middlenum {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		solution(array);
	}

	public static void solution(int[] array) {

		Arrays.sort(array);

		System.out.println(array[(int) Math.floor(array.length / 2)]);

	}
}
