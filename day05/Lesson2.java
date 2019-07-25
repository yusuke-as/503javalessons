import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("点数を入力してください＞");
		int num =sc.nextInt();
		if (num<40){
			System.out.println("不可です");
		}
		else if(num<60){
			System.out.println("可です");
		}
		else if(num<80){
			System.out.println("良です");
		}
		else if(num<=100){
			System.out.println("優です");
		}
	}
}

