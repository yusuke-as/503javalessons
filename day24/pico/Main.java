import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("右手に何を持ちますか?>");
		Hands right1=new Hands(sc.nextLine());
		System.out.println("i have a "+ right1.name);
		System.out.print("左手に何を持ちますか?>");
		Hands left1=new Hands(sc.nextLine());
		System.out.println("i have a "+ left1.name);
		System.out.println("--------------");
		System.out.println(left1.name+right1.name+"!");
		System.out.println("--------------");
		System.out.print("右手に何を持ちますか?>");
		Hands right2=new Hands(sc.nextLine());
		System.out.println("i have a "+ right2.name);
		System.out.print("左手に何を持ちますか?>");
		Hands left2=new Hands(sc.nextLine());
		System.out.println("i have a "+ left2.name);
		System.out.println("--------------");
		System.out.println(left2.name+right2.name+"!");
		System.out.println("--------------");
		System.out.println();
		System.out.println("--------------");
		System.out.println(left1.name+right1.name+"~"+left2.name+right2.name);
		System.out.println();
		System.out.println(right2.name+left2.name+left1.name+right1.name+"!!!");
		System.out.println("--------------");
	}
}
