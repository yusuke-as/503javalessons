import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("ArrayListの練習だ!");
		System.out.println("Listに数字をどんどん追加してみよう!");
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0)で終了>");
			int n=sc.nextInt();
			if(n!=0){
				list.add(n);
				System.out.println(n+"をListに追加したよ!");
			}else{
				break;
			}
		}
		System.out.println("要素数:"+list.size());
		System.out.print("要素:");
		for(int n:list){
			System.out.print(n+",");
		}
	}
}
