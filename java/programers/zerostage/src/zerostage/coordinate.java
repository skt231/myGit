package zerostage;

public class coordinate {

	public static void main(String[] args) {
        int[] dot={+1,-2};
        solution(dot);
    }
    
    public static void solution(int[] dot) {
        //내가 푼방식
        // for(int i=0;i<dot.length-1;i++){
        //     if(dot[i]>0){
        //         if(dot[i+1]>0){
        //             System.out.println(1);
        //         }else if(dot[i+1]<0){
        //             System.out.println(3);
        //         }
        //     }else if(dot[i]<0){
        //         if(dot[i+1]>0){
        //             System.out.println(2);
        //         }else if(dot[i+1]<0){
        //             System.out.println(4);
        //         }
        //     }
        // }
        //한번더 생각
        int x= dot[0]>0?1:0;
        int y= dot[1]>0?1:0;
        if(x==1 && y==1){
            System.out.println(1);
        }else if(x==1 && y==0){
            System.out.println(4);
        }else if(x==0 && y==1){
            System.out.println(2);
        }else if(x==0 && y==0){
            System.out.println(3);
        }
    }

}
