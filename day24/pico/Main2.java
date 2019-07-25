import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String[] hand=new String[4];
		for(int i=0;i<hand.length/2;i++){
			System.out.print("右手に何を持ちますか?>");
			Hands righti=new Hands(sc.nextLine());
			hand[i]=righti.name;
			System.out.println("i have a "+ hand[i]);
			System.out.print("左手に何を持ちますか?>");
			Hands lefti=new Hands(sc.nextLine());
			hand[i+1]=lefti.name;
			System.out.println("i have a "+ hand[i+1]);
			System.out.println("--------------");
			System.out.println(hand[i+1]+hand[i]+"!");
			System.out.println("--------------");
		}
		System.out.println();
		System.out.println("--------------");
		System.out.println(hand[1]+hand[0]+"~~"+hand[3]+hand[2]);
		System.out.println();
		System.out.println("--------------");
	}
}
