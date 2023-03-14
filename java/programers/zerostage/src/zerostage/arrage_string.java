package zerostage;

import java.util.regex.Pattern;

//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
public class arrage_string {

	public static void main(String[] args) {
		String my_string="1n2n3n4n5";
		System.out.println(solution(my_string));

	}
	  public static int[] solution(String my_string) {
	        
	        
	        String pattern = "^[0-9]*$";
	        for(int i=0;i<my_string.length();i++) {
	        	if(Pattern.matches(pattern, my_string)) {
	        		my_string.replaceAll(my_string, "");
	        	}
	        }
	        char[] stringArr = my_string.toCharArray();
	        int[] answer = {stringArr.length};
//	        for(int i=0;i<stringArr.length;i++) {
//	        	answer[i]=stringArr[i];
//	        }
	        return answer;
	    }

}
