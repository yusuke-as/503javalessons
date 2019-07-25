import java.util.*;
public class Q1_2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand =new Random();
		int num=rand.nextInt(10)+1;//数値の生成
		int ans=0;//ユーザーの回答
		int count=0;//試行回数
		int times=5;//最大の試行回数
		System.out.println("1~100の番号を決めたよ！当ててみて！");
		do{
			count++;
			if(count<=times){
				System.out.printf("%d回目いくつだと思いますか？>>",count);
				ans=sc.nextInt();
				if(count==times){
				}else if(count<times){
					if(num<ans){
						System.out.println("もっと下だよ！");
					}else if(num>ans){
						System.out.println("もっと上だよ！");
					}
				}
			}else{
				break;
			}
		}while(num!=ans);
			if(num==ans){
				System.out.printf("当たり！%dです",num);
			}else{
			System.out.printf("残念！正解は%dです",num);
			}
	}
}
