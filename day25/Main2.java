import my.util.*;
public class Main2{
	public static void main(String[] args){
		int a=Common.input("整数a>");
		int b=Common.input("整数b>");
		while(true){
			int ans=Common.input("番号を入力 1.和 2.差 3.積 4.最大公約数 5.終了>");
			switch(ans){
			case 1:
				Common.print(a+b);
				continue;
			case 2:
				Common.print(a-b);
				continue;
			case 3:
				Common.print(a*b);
				continue;
			case 4:
				Common.print(Common.gcdOf(a,b));
				continue;
			default:
				Common.print("アプリを終了します。");
				break;
			}
			break;
		}
	}
}
