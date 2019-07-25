import java.util.*;
public class Q5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更 >>");
		int selected=sc.nextInt();
		switch(selected){
		case 1:
			System.out.print("検索します");
			break;
		case 2:
			System.out.print("登録します");
			break;
		case 3:
			System.out.print("削除します");
			break;		
		case 4:
			System.out.print("変更します");
			break;
		default:
			break;
		}
	}
}
