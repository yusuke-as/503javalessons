import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力>");
		int n=sc.nextInt();
		System.out.println(sumOf(n));
	}
	static int sumOf(int n){
		//再帰処理
		if(n==1){
			return n;
		}else{
			return n+sumOf(n-1);
		}
	}
}
