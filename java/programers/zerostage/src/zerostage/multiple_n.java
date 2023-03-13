package zerostage;

public class multiple_n {

	public static void main(String[] args) {
		int[] numlist= {3,4,5,6,7,9,12};
		solution(3,numlist);

	}
	public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int k=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                answer[k] = numlist[i];
                k++;
            }
        }
        return answer;
    }
}
