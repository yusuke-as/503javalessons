import java.util.*;
public class Q7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数Aの数値を入力してください>>");
		int numA=sc.nextInt();
		System.out.print("整数Bの数値を入力してください>>");
		int numB=sc.nextInt();
		if(numB<=numA){
			while(numB<=numA){
		    	System.out.printf("%d ",numB);
				numB++;
			}
		}else if(numB>numA){
			while(numB>=numA){
		    	System.out.printf("%d ",numB);
				numB--;
			}
		}
	}
}
