package zerostage;

public class solvecode {

	public static void main(String[] args) {
		System.out.println(solution("dfjardstddetckdaccccdegk",4));

	}
	   public static String solution(String cipher, int code) {
	        String answer = "";
	            char[] cipher_arr=cipher.toCharArray();
	            for(int i=0;i<cipher_arr.length;i++){
	                if((i+1)%code==0){
	                    answer+=cipher_arr[i];
	                }
	            }
	        return answer;
	    }

}
