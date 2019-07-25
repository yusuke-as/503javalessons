import java.util.*;
public class Q2_ans{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] hands={"グー","チョキ","パー"};
		System.out.println("じゃんけんゲーム!!");
		System.out.print("手を入力してね。0:グー,1:チョキ,2:パー>");
		int userHand=sc.nextInt();
		int pcHand=rand.nextInt(hands.length);
		System.out.println("あなたは"+hands[userHand]);
		System.out.println("ｐｃは"+hands[pcHand]);

		String ans;
		int diff=(userHand+3-pcHand)%3;
		if(diff==0){
			ans="引き分け";
		}else if(diff==1){
			ans="負け";
		}else{
			ans="勝ち";
		}
		System.out.println(ans);

		/*
		String ans;
		if(userHand==pcHand){
			ans="引き分けです";
		}else if(useHand==0 && pcHand==1 ||userHand==1 && pcHand==2 ||userHand==2 && pcHand==0){
			ans="あなたの勝ちです";
		}else{
			ans="あなたの負けです";
		}
		System.out.println(ans);
		*/
	}
}
