import java.util.*;
public class Q2{
	static int namePower(String name){
		int sum=0;
		for(int i=0;i<name.length();i++){
			sum+=name.charAt(i);
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("名前を入力>");
		String name=sc.next();
		int power=namePower(name);
		System.out.println("POWER:"+power);
	}
}
