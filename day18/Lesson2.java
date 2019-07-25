import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double[] weights=new double[3];
		double sum=0.0;
		for(int i=0;i<weights.length;i++){
			System.out.print(i+1+"日目:");
			weights[i]=sc.nextDouble();
			sum+=weights[i];
		}
		for(int i=0;i<weights.length;i++){
			System.out.printf("%d日目:%.1f㎏%n",i+1,weights[i]);
		}
		System.out.printf("合計:%.1f㎏%n",sum);
		System.out.printf("平均:%.1f㎏%n",sum/weights.length);
	}
}
