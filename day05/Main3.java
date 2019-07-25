import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		Sccaner sc =new Scanner(System.in);
			System.out.print("整数を入力してください＞");
		int num =sc.nextInt();
		if(num % 2==0){
			System.out.println(num+"は偶数です");
		}else{
			System.out.println(num+"は奇数です");
		}
	}
}

