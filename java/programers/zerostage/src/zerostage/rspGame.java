package zerostage;

public class rspGame {

	public static void main(String[] args) {
        String player1="035";
        rsp(player1);
    }
    public static void rsp(String player1){
        String player2="";
        for(int i=0;i<player1.length();i++){
            if(player1.substring(i,i)=="0"){
                player2+="5";
                 }else if(player1.substring(i,i)=="2"){
                player2+="0";
                 }else if(player1.substring(i,i)=="5"){
                player2="2";
                }
                  
        }
        System.out.println(player2);
    }
}