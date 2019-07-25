import java.util.*;
public class lesson1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand=new Random();
		System.out.println("ようこそ占いの館へ");
		System.out.print("あなたの名前を入力してください>>");
		String name = sc.nextLine();
		System.out.print("あなたの年齢を入力してください>>");
		String ageString =sc.nextLine();
		int age = Integer.parseInt(ageString);
		int fortune=rand.nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age+"歳の"+name+"さんの運気番号は"+fortune+"です");
		System.out.println("1:大吉　2:中吉　3:吉　4:凶");

	}
}
