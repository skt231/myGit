package zerostage;

public class repeat_char {

	public static void main(String[] args) {
		String my_string="ABCDE";
		solution(my_string,2);

	}
	 public static void solution(String my_string,int n) {
	        String answer = "";
	        char[] arr = my_string.toCharArray();
	        for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<n;j++) {
	        		answer += arr[i];
	        	}
	        }
	        System.out.println(answer);
	    }

}
