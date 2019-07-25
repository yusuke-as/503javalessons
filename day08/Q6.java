import java.util.*;
public class Q6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=1,sum=0;
		System.out.print("numの数値を入力してください>>");
		int num=sc.nextInt();
		while(count<=num){
			sum+=count;
			count++;
		}
		System.out.printf("1~%dを足すと%dです。",num,sum);
	}
}
