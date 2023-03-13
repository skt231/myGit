package zerostage;

public class height_mersseg {

	public static void main(String[] args) {
		int[] array= {150,160,170,180,190};
		solution(array,160);

	}
    public static void solution(int[] array, int height) {
        int answer = 0;
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>height){
                cnt++;
            }
        }
        answer=cnt;
        System.out.println(answer);
    }

}
