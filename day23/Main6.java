import java.util.*;
public class Main6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力>");
		int n=sc.nextInt();
 		System.out.printf("最大素数は%dです。%n",maxPrime(n));
	}
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	static int maxPrime(int n){
		int prime=0;
		for(int i=n;i>=2;i--){
			if(isPrime(i)){
				prime=i;
				break;
			}
		}
		return prime;
	}
}
