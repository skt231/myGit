package test;

import java.util.Arrays;
import java.util.Scanner;

//N개의 수가 주어졌을때, 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.(즉,A(i)+..+A(j)의 합이 M으로 나누어 떨어지는 구간
//(i,j)쌍의 개수를 구하시오.)
public class restSum {

	public static void main(String[] args) {
		quest();

	}

	public static void quest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("개수를 입력하세요.");
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] array = new int[N];
		int[] result_Array = new int[M];
		int answer = 0;
		array[0] = scan.nextInt();
		//수열 합배열 만들기
		for (int i = 1; i <= N; i++) {
			array[i] = array[i - 1] + scan.nextInt();
		}
		//합배열 모든 값에 %연산수행하기
		for (int i = 0; i < N; i++) {
			int remainder = array[i] % M;
			//0부터 i까지의 구간의 합자체가 0일때 정답에 더하기
			if (remainder == 0) {
				//나머지가 같은 인덱스의 개수 카운터함
				answer++;
			}
			result_Array[remainder]++;
		}
		for (int i = 0; i < M; i++) {
			//나머지가 같은 인덱스수 중 2개를 뽑는 경우 의 수를 구하기
			if (result_Array[i] > 1) {
				answer = answer + (result_Array[i] * (result_Array[i] - 1) / 2);
			}
		}

		System.out.println(answer);
	}
}
