import java.util.*;
public class lesson1re{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("名前");
		String name =sc.nextLine();
		Random rand = new Random();
		int fortune=rand.nextInt(100);
		System.out.println(name+"歳は"+fortune+"ですか");

	}
}

