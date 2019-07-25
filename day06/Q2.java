import java.util.*;
public class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("月を入力してください(半角数字のみ)>>");
		int month =sc.nextInt();
		if(month==3 || month==4 || month==5){
			System.out.printf("%d月は春です！",month);
		}else if(month==6 || month==7 || month==8){
			System.out.printf("%d月は夏です！",month);
		}else if(month==9 || month==10 || month==11){
			System.out.printf("%d月は秋です！",month);
		}else if(month==12 || month==1 || month==2){
			System.out.printf("%d月は冬です！",month);
		}else{
			System.out.printf("%dなんて月はありません",month);
		}
	}
}
