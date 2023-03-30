package test;

import java.util.Scanner;

public class Sum_numpr {

	public static void main(String[] args) {
		
		/* System.out.println(sum_num()); */
		System.out.println(sum_num2());

	}

	public static int sum_num() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num = 0;
		for (int i = 1; i <= N; i++) {
			num += i;
		}
		return num;
	}
	public static int sum_num2() {
		Scanner scan2 = new Scanner(System.in);
		String sNum=scan2.next();
		char[] cNum= sNum.toCharArray();
		int num=0;
		for (int i = 0; i < cNum.length; i++) {
			num += cNum[i];
		}
		return num;
	}
}
