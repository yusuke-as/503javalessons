import java.util.*;
public class Q1{
	static void ans(int num){//ansメソッドでfor文処理
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
			System.out.print(i+1);
			}		
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("どこまで出力しますか>>");
		int userInput=sc.nextInt();
		ans(userInput);
	}
}
