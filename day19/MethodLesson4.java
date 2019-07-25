import java.util.*;
public class MethodLesson4{
	static int calcPrice(int sum,int tax){
		double ans=sum*tax/100d;
		return (int)ans;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("消費税は何％ですか。>");
		int tax =sc.nextInt();
		int sum=0;
		int price=0;
		do{
			System.out.print("価格を入力(0でお会計)>");
			price=sc.nextInt();
			sum+=price;
		}while(price!=0);
		System.out.printf("お買い物合計金額は%d円(税込み)です。",sum+calcPrice(sum,tax));
	}
}
