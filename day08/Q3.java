import java.util.*;
public class Q3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num,count=0;
		System.out.print("個数を入力してください>>");
		num=sc.nextInt();
		while(count<num){
			count++;
			System.out.print("$");
		}
			System.out.println();
	}
}
