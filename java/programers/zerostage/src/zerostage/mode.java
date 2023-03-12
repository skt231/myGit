package zerostage;

public class mode {

	public static void main(String[] args) {
		int[] array= {1,3,3,4,5,6};
		mode(array);

	}
	public static void mode(int[] array) {
		   int answer = 0;
	        int cnt=0;
	        int[] index=new int[array.length+1];
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<array.length;i++){
	        	index[array[i]]++;
	            for(int j=0;j<array.length;j++){
	                if(array[i]==array[j]){
	                    cnt++;
	                }
	            }
	        }
	        for(int i=0;i<index.length;i++) {
	        	if(index[i]>max) {
	        		max=index[i];
	        		answer=i;
	        	}
	        }
	        System.out.println(max);
	    }
	}