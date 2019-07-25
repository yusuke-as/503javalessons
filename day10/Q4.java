import java.util.*;
public class Q4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("階乗を出力します。整数を入力してください>>");
		int n =sc.nextInt();
		int ans=1;
		for(;n>0;n--){
			ans*=n;
		}
		System.out.println(ans);
	}
}
