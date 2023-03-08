package zerostage;
//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
public class pizza_musseg_1 {
	 public int solution(int n) {
	        return n%7!=0?(n/7)+1:n/7;
	    }
	 //머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
//피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 public int solution(int slice, int n) {
	      int answer = 0;
	    answer = (n % slice) == 0 ? (n / slice) : ((n / slice) + 1);
	    return answer;
	    }
}
