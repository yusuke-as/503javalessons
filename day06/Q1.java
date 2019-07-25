import java.util.*;
public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("信号の色を入力してください>>");
		String color =sc.nextLine();
		switch(color){
			case "赤":
				System.out.printf("%sは止まれ！",color);
				break;
			case "黄":
				System.out.printf("%sは注意！",color);
				break;
			case "緑":
			case "青":
				System.out.printf("%sは進め！",color);
				break;
			default:
				System.out.printf("信号に%sはありません！！",color);
		}
	}
}

