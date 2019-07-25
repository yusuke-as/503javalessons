import java.util.*;
public class lesson5{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("あなたの身長は(cm)？");
		double height =sc.nextDouble();
		double heightM =height/100;
		System.out.print("あなたの体重は(kg)？");
		double weight =sc.nextDouble();
		double BMI=weight/(heightM*heightM);
		System.out.printf("あなたのBMIは%.2fです。",BMI);
	}
}
