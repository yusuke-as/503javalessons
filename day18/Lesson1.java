import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("どこまで>");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.printf("1-%dまで足すと%dです%n",n,sum);
	}
}
