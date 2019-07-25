import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("整数を入力してください＞");
		int num =sc.nextInt();
		if (num>0){
			System.out.println("正の値です");
		}
		else if(num<0){
			System.out.println("負の値です");
		}
		else{
			System.out.println("ゼロです");
		}
	}
}

