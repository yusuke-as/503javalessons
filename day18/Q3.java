import java.util.*;
public class Q3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("あなたの年齢>");
		int age=sc.nextInt();sc.nextLine();
		System.out.print("あなたの名前>");
		String name=sc.nextLine();
		System.out.println(age+"才の"+name+"さん。こんにちは！");
	}
}
