import java.util.*;
public class Q8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数Aの数値を入力してください>>");
		int num=sc.nextInt();
		int count=1;
		String ans;
		while(count<=num){
			if (count%3==0 && count%5==0){//上から順に処理なので3を先に入れるとFizzになってしまう！
				ans="FizzBuzz";
			}else if(count%3==0){
				ans="Fizz";
			}else if(count%5==0){
				ans="Buzz";
			}else{
				ans=count+"";// ans=String.valueOf(count)の方が正規記述
			}
			System.out.println(ans);
			count++;
		}
	}
}
