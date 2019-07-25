import java.util.*;
public class Q3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("月を入力してください(半角数字のみ)>>");
		int month =sc.nextInt();
		switch(month){
			case 3:	case 4:	case 5:
				System.out.printf("%d月は春です！",month);
				break;
			case 6: case 7: case 8:
				System.out.printf("%d月は夏です！",month);
				break;
			case 9: case 10: case 11:
				System.out.printf("%d月は秋です！",month);
				break;
			case 12: case 1: case 2:
				System.out.printf("%d月は冬です！",month);
				break;
			default:
				System.out.printf("%dなんて月はありません",month);
		}
	}
}
