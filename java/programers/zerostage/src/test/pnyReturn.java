package test;
//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 

//다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
//단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

public class pnyReturn {

	public static void main(String[] args) {
		System.out.println(solution("poppy"));

	}

	static boolean solution(String s) {
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;
		String[] arr = s.toLowerCase().split("");
		for (int i = 0; i < arr.length; i++) {
			if ("p".equals(arr[i])) {
				pCount++;
			}
			if ("y".equals(arr[i])) {
				yCount++;
			}
		}
		if (pCount == yCount) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
}
