package test;

import java.util.Scanner;
import java.util.Stack;

public class statck_Ascendingorder {

	public static void main(String[] args) {
		ACO();

	}

	public static void ACO() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num = 1;
		boolean result = true;
		for (int i = 0; i < array.length; i++) {
			int su = array[i]; // 현재 수열의 수
			if (su >= num) { // 현재 수열값 >= 오름차순 자연수 : 값이 같아질때까지 ,push() 수행
				while (su >= num) { // push()
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else { // 현재 수열값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
				int n = stack.pop();
				// 스택의 가장위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할수 없음

				if (n > su) {
					System.out.println("No");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if (result) {
			System.out.println(bf.toString());
		}
	}

}
