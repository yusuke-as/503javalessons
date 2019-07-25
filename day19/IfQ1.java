import java.util.*;
public class IfQ1{
	public static void main(String[] args){
		Random rand=new Random();
		int num=rand.nextInt(10);
		System.out.println(num+"は"+(num%2==0 ? "偶数":"奇数")+"です");
	}
}
