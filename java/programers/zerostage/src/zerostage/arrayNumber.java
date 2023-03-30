package zerostage;

import java.util.Arrays;

public class arrayNumber {

	public static void main(String[] args) {
		int[] arr = new int[] { 30, 25, 40, 21, 10, 13 };
		System.out.println(Arrays.toString(arrayNumb(arr)));

	}

	public static <arr> int[] arrayNumb(int[] arr) {
		int[] answer = { arr.length };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					answer[i] = arr[i];
				}
			}
		}
		return arr;
	}

}
