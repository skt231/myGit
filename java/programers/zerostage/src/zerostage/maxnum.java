package zerostage;

public class maxnum {

	public static void main(String[] args) {
		int numbers[]= {0, 31, 24, 10, 1, 9};
		 solution(numbers);
		 }
		  public static void solution(int[] numbers) {
		        int max=numbers[0]*numbers[1];
		        for(int i=0;i<numbers.length;i++){
		            for(int j=0;j<numbers.length;j++){
		             if(i!=j){
		               if(max<numbers[i]*numbers[j]){
		                   max=numbers[i]*numbers[j];
		               }
		             }
		            }
		        }
		        System.out.println(max);
		    }
	
}
