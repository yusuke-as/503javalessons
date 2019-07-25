import java.util.*;
public class Q6{
	public static void main(String[] args){
		Random rand=new Random();
		int n;
		int i=0;
		do{
			i++;
			n=rand.nextInt(101);
			System.out.printf("%d回目、%dがでました%n",i,n);
		}
		while(n!=100);
			System.out.printf("%d回目で100がでました%n",i);
	}
}
