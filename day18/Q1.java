import java.util.*;
public class Q1{
	static int sumOf(int a,int b,int c){
		return a+b+c;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("計算マシーンを使いますか？(y or n)>");
			String userAns=sc.next().toLowerCase();
			if(!userAns.equals("y")){
				break;
			}
			System.out.print("数字を3つ入力してください>");
			int ans=sumOf(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("合計は"+ans+"です。");
		}
		System.out.println("アプリケーションを終了します。");
	}
}
