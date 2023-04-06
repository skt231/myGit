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
		int N = scan.nextInt();// 자연수 입력
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		while (end_index != N) {
			if (sum == N) { // 현재 연속 합이 N과 같은 경우
				count++;
				end_index++;
				sum += end_index;
			} else if (sum > N) { // 현재 연속 합이 N보다 큰 경우
				sum -= start_index;
				start_index++;
			} else { // 현재 연속 합이 N보다 작은 경우
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);

	}

}
