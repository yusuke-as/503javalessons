import java.util.*;
public class Q5{
	public static void main(String[] args){
		int sum=0;
		for(int i=0;i<10;i++){
		Random rand=new Random();
		int n=rand.nextInt(100)+1;
		System.out.print(n+",");
			sum+=n;
		}
		System.out.printf("%n合計は%dです",sum);
	}
}
