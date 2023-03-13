package zerostage;

public class del_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static void solution(String my_string) {
         String answer = "";
         String[] stringArr={};
         char[] vowel={'a','e','i','o','u'};
     for(int i=0;i<my_string.length();i++){
         stringArr[i]=my_string.charAt(i);
     }//ㅁㅜㄴㅈㅏㅇㅕㄹㅇㅡㄹ ㅂㅐㅇㅕㄹㄹㅗ
         for(int i=0;i<stringArr.length;i++){
             for(int j=0;j<vowel.length;j++){
                 if(stringArr[i].equals(vowel[j])){
                 answer=stringArr.replace(stringArr[i],"");   
             }
            }
         }
     System.out.println(answer); 
 }
}
