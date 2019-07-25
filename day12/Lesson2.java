import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何日分のデータを入力しますか？>>");
		int days=sc.nextInt();
		double[] weights=new double[days];
		double sum=0;
		for(int i=0;i<weights.length;i++){
			System.out.print((i+1)+"日目のデータを入力>>");
			weights[i]=sc.nextDouble();
			sum+=weights[i];
		}
		//System.out.println(Arrays.toString(weights));
		System.out.printf("%n体重結果…！%n");
		for(int i=0;i<weights.length;i++){
			System.out.println((i+1)+"日目"+weights[i]+"㎏");
		}
		double ave=sum/weights.length;
		System.out.println("平均は"+ave+"㎏");
		double min =weights[0];
		for(int i=1;i<weights.length;i++){
			if(min>weights[i]){
				min=weights[i];
			}	
		}
		System.out.println("目標は"+(min-2)+"㎏");

	}
}
