import java.util.*;
public class Main5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力>");
		int n1=sc.nextInt();
		System.out.print("正の整数を入力>");
		int n2=sc.nextInt();
		System.out.println("最大公約数は"+gcdOf(n1,n2));
	}
	static int gcdOf(int n1,int n2){
		int mod=n1%n2;
		if(mod==0){
			return n2;
		}else{
			return gcdOf(n2,mod);
		}
	}
}
