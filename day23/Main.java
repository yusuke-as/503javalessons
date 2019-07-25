import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数を入力>");
		int n=sc.nextInt();
		countDown(n);
	}
	static void countDown(int n){
		//再帰処理(recursive)
		if(n==1){
			System.out.println(n);
		}else{
			System.out.println(n--);
			countDown(n);
		}
	}
	/*static void countDown(int n){
		for(int i=n;i>0;i--){
			System.out.println(i);
		}
	}
	*/
}
