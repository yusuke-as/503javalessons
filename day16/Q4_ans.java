import java.util.*;
public class Q4_ans{
	public static int maxOf(int a,int b,int c){
		int max=a;
		if(b>max){
			max=b;
		}
		if(c>max){
			max=c;
		}
		return max;
	}
	public static int maxOf2(int a,int b,int c){
		return Math.max(Math.max(a,b),c);
	}
}
