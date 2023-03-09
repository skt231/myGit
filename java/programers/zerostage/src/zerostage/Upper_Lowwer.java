package zerostage;

import java.util.Arrays;

public class Upper_Lowwer {
	public static void main(String[] args) {
	
	}
	
	  public static void solution(String my_string) {
	        String[] array = my_string.split("");
	        for(int i=0;i<array.length;i++){
	           if(Character.toUpperCase(array[i])){
	             array[i]=array[i].toLowerCase();
	           }else{
	               array[i]=array[i].toUpperCase();
	           }   
	        }
	        System.out.println(Arrays.toString(array));
	        
	    }
	}

