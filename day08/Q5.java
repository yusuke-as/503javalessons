import java.util.*;
public class Q5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0,count;
		System.out.print("5を何回足しますか？>>");
		count=sc.nextInt();
		int forResult=count;
		while(count>0){
			sum+=5;
			count--;
		}
		System.out.printf("5を%d回足すと%dです。",forResult,sum);
	}
}
