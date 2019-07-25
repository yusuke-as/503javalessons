import java.util.*;
public class Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand =new Random();
		int num=rand.nextInt(10)+1;
		int ans;
		int count=0;
		System.out.println("1~100の番号を決めたよ！当ててみて！");
		do{
			count++;
			System.out.printf("%d回目いくつだと思いますか？>>",count);
			ans=sc.nextInt();
			if(num<ans){
				System.out.println("もっと下だよ！>>");
			}else if(num>ans){
				System.out.println("もっと上だよ！>>");
			}
		}
		while(num!=ans);
			System.out.printf("%d回目で当たり！%dです",count,num);
	}
}
