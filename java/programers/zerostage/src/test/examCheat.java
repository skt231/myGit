package test;

import java.util.Scanner;

public class examCheat {

	public static void main(String[] args) {

		examcheat();

	}

	public static void examcheat() {

		Scanner scan = new Scanner(System.in);
		System.out.println("배열수를 입력하세요");
		int N = scan.nextInt();// 배열 수
		float[] score = new float[N];
		// 입력으로 점수 넣기
		for (int i = 0; i < N; i++) {
			System.out.println("다음 수를 입력하세요");
			score[i] = scan.nextFloat();
		}
		float M = 0;// 최대점수
		float[] scoreCheat = new float[score.length];// 조작된 점수
		// 최대값 구하기
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i] > score[j]) {
					M = score[i];
				}
			}
		}
		// 각 과목 점수 조작
		int sum = 0;
		for (int i = 0; i < scoreCheat.length; i++) {
			scoreCheat[i] = score[i] / M * 100;
			sum += scoreCheat[i];
		}
		// 조작된 점수의 평균값
		float avg = sum / scoreCheat.length;

		System.out.println("최대수 : "+ M);
		System.out.println("총 합 :"+sum);
		System.out.println("평 균 : "+avg + "점");
	}

}
