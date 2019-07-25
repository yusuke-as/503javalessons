import java.util.*;
public class Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] choice={"グー","チョキ","パー"};
		System.out.println("じゃんけんゲーム!!");
		System.out.print("手を入力してね。0:グー,1:チョキ,2:パー>>");
		int userChoice=sc.nextInt();
		System.out.println("あなたは"+choice[userChoice]);
		int pcChoice=rand.nextInt(3);
		System.out.println("ｐｃは"+choice[pcChoice]);
		
		String ans;
		if(userChoice==pcChoice){
			ans="引き分け!";
		}else if((userChoice==0 &&pcChoice==1)||(userChoice==1 &&pcChoice==2)||(userChoice==2 &&pcChoice==0)){
			ans="あなたの勝ち!";	
		}else{
			ans="あなたの負け!";
		}
		System.out.println(ans);
	}
}
