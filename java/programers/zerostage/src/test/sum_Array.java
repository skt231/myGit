package test;

import java.util.Scanner;

public class sum_Array {
	// 연속된 자연수의 합으로 나타내는 가짓수를 출력하는 프로그램을 작성하시오.
	// ex)15=15,7+8,4+5+6,1+2+3+4+5
	public static void main(String[] args) {
		quest();

	}

	public static void quest() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		while (end_index != N) {
			if (sum == N) {
				count++;
				end_index++;
				sum += end_index;
			} else if (sum > N) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);

	}

}
