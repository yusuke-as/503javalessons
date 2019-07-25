import java.util.*;
public class Q4{
	public static void main(String[] args){
		Random rand =new Random();
		int num=0;
		int count=0;
		while(!(num==7)){
		count++;
		num=rand.nextInt(10)+1;
		System.out.printf("%d回目、出た数値は%dです%n",count,num);
		}
		System.out.printf("%d回目に7が出ました!",count);
	}
}
