import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		int x =7;
		int y =3;
		Scanner sc = new Scanner(System.in);
		System.out.print("オペレーターを選択してください。1:+ 2:- 3:* 4:/ 5:% >>");
		int num =sc.nextInt();
		if(num==1){
			System.out.printf("計算結果は%d+%d=%dです",x,y,x+y);
		}else if(num==2){
			System.out.printf("計算結果は%d-%d=%dです",x,y,x-y);
		}else if(num==3){
			System.out.printf("計算結果は%d*%d=%dです",x,y,x*y);
		}else if(num==4){
			System.out.printf("計算結果は%d/%d=%dです",x,y,x/y);
		}else if(num==5){
			System.out.printf("計算結果は%d%%%d=%dです",x,y,x%y);
		}else{
			System.out.print("不正な選択です");
		}

	}
}

