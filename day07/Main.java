import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num;
		do{
			System.out.print("正の整数を入力してください>>");
			num=sc.nextInt();
		}
		while(num<=0);
		System.out.println("あなたが入力したのは"+num+"です");
	}
}
