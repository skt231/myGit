package test;

import java.util.Scanner;
import java.util.stream.Stream;

//머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
//머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
public class game_369 {

	public static void main(String[] args) {
		System.out.println(solution());

	}

	public static int solution() {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int count = 0;
//		int[] digits = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
		String temp = Integer.toString(number);
		int[] digits = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			digits[i] = temp.charAt(i) - '0';
		}
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 3 == 0) {
				count++;
			}

		}
		return count;
	}

}
