package test;

//정수 배열array가 매개변수로 주어질떄, 가장 큰 수와 그수의 인덱스를 담은 배열을 return하도록 solution함수를 완성하라ㅏ
public class max_num {

	public static void main(String[] args) {
		int[] array = { 3, 5, 10, 20, 50 };
		solution(array);

	}

	public static int[] solution(int[] array) {
		int[] answer = new int[2];
		int max = 0;
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		answer[0] = max;
		answer[1] = index;

		return answer;
	}

}
