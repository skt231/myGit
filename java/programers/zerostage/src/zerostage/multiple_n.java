package zerostage;

public class multiple_n {
//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		int[] numlist= {3,4,5,6,7,9,12};
		solution(3,numlist);

	}
	public static void solution(int n, int[] numlist) { 
		  int k=0;
		  int[] arry = new int[numlist.length];
		  for(int i=0;i<numlist.length;i++) {
			  if(numlist[i]%n==0) {
				  arry[k] = numlist[i];
				  k++;
			  }
		  }
		  int[] answer = new int[k];
		    for(int i = 0; i<k; i++){
	            answer[i] = arry[i];
	        }
	        System.out.println(answer); 
    }
}

