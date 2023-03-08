package zerostage;
//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class even_odd {
    public int[] solution(int[] num_list) {
        int[] answer =new int[2];
        int numeven=0;
        int numodd=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                numeven++;
            }else if(num_list[i]%2==1){
                numodd++;
            }else{
                break;
            }
        }
        answer[0]=numeven;
        answer[1]=numodd;
          
        return answer;
    }
}
	


