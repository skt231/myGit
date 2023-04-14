package test;

public class game_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solution(int order) {
	        int answer = 0;
	        int count=0;
	        int[] array_order=new int[length(order)];
	        
	        for(int i=0;i<order.length();i++){
	        array_order[i]=Math.floor(order / Math.pow(10,order.length()-1));    
	        
	       if(array_order[i]%3==0){
	           count++;
	       }
	        }
	        answer=count;
	        
	        return answer;
}
