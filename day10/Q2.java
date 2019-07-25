import java.util.*;
public class Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数Aを入力>>");
		int A=sc.nextInt();
		System.out.print("整数Bを入力>>");
		int B=sc.nextInt();
		for (; A>=B ; A--) {
			if(A%2==0){
			System.out.print(A+" ");
			}
		}
	}
}
