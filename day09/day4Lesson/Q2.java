import java.util.*;
public class Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("スペイン語で日曜はどれ？1:Lunes,2:Jueves,3:Domingo >>");
		int ans =sc.nextInt();
		switch(ans){
		case 1:
		case 2:
			System.out.print("No.....");
			break;
		case 3:
			System.out.print("OK!!!!!");
			break;
		}
	}
}
