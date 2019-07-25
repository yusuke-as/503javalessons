import java.util.*;
public class Main6_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力>");
		int n=sc.nextInt();
		System.out.print("最大素数は"+maxPrime(n));
	}
	public static int maxPrime(int n){
		int primeNumber=0;
		for(int i=n;i>1;i--){
			if(isPrime(i)==true){
				primeNumber=i;
				break;
			}
		}
		return primeNumber;
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
}
