import java.util.*;
public class Q3{
	public static void main(String[] args){
		Random rand = new Random();
		int n=rand.nextInt(10)+1;
		if(n%2==0){
			System.out.printf("%dは偶数です",n);
		}else{
			System.out.printf("%dは奇数です",n);
		}
	}
}
