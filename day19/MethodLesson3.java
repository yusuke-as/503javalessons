import java.util.*;
public class MethodLesson3{
	static double calcBMI(double weightKg,double heightCm){
		return weightKg/((heightCm/100)*(heightCm/100));
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("体重を入力してください(㎏)>");
		double weight=sc.nextDouble();
		System.out.print("身長を入力してください(㎝)>");
		double height=sc.nextDouble();
		double BMI=calcBMI(weight,height);
		System.out.printf("体重:%.1f㎏,身長:%.1f㎝のBMIは%.1fです。%n",weight,height,BMI);
	}
}
