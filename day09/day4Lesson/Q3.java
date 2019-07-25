import java.util.*;
public class Q3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("日本の信号で渡っていい色は？漢字一文字で答えよ>>");
		String ans =sc.nextLine();
		switch(ans){
		case "青":
		case "緑":
			System.out.print("正解!!!");
			break;
		default:
			System.out.print("残念.....");
			break;
		}
	}
}
