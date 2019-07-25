import java.util.*;
public class Q5{
	public static void main(String[] args){
		int n=1;
		int max=100;
		int sum=0;
		while(n<=max){
			sum+=n;
			n++;
		}
		System.out.printf("1から%dまで足すと%dです",max,sum);
	}
}
