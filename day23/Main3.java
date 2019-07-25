import java.util.*;
public class Main3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力>");
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	static int fact(int n){
		if(n==1){
			return n;
		}else{
			return n*fact(n-1);
		}
	}
}
