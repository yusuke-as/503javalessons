import java.util.*;
public class lesson3{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("ワンちゃんの名前を入力してください>>");
		String name=sc.nextLine();
		System.out.print(name+"の年齢を入力してください>>");
		int age=sc.nextInt();
		System.out.printf("%s(%d才)人間の年齢だと%d才です。",name,age,age*7);

	}
}
