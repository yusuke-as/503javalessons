import java.util.*;
public class Lesson3{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("英語で9月は？小文字で入力してください＞");
		String ans =sc.nextLine();
		if(ans.equals("september")){
			System.out.println("正解！");
		}else {
			System.out.println("残念！");
		}
	}
}

