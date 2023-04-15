package test;

public class maxNum_2 {
	// 정수 배열 numbers가 매개변수로 주어진다.numbers의 원소중 두개를 곱해 만들수 있는 최댃값을 return하도록 solution
	// 함수를 완성하라.
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6, 7 };
		System.out.println(solution(arr));

	}

	public static int solution(int[] numbers) {
		int answer = 0;
		int complex = 0;
		int complex_max = 0;
		int low_number = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					// if its number is minus..
					if (numbers[i] < numbers[j]) {
						low_number = numbers[i];
					}
					complex = numbers[i] * numbers[j];
					// if its number is plus...
					if (complex > 0) {
						if (complex_max < complex) {
							complex_max = complex;
						}
					}
					// if its number is minus
					if (complex < 0) {
						if (low_number < complex) {
							complex_max = complex;
						}
					}
				}
			}
		}

		answer = complex_max;
		return answer;
	}

}
