import java.util.*;
public class Q5{
	public static void main(String[] args){
		Random rand =new Random();
		int numA=-1;
		int numB=0;
		int count=0;
		while(!(numA==numB)){
		count++;
		numA=rand.nextInt(6)+1;
		numB=rand.nextInt(6)+1;
		System.out.printf("%d回目、出た数値は%dと%dです%n",count,numA,numB);
		}
		System.out.printf("%d回目にぞろ目%d%dが出ました!",count,numA,numB);
	}
}
