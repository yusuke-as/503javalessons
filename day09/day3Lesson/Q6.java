import java.util.*;
public class Q6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int height=0;
		while(height!=634){
			System.out.print("スカイツリーの高さは(M)？>>");
			height=sc.nextInt();
			if(height!=634){
				System.out.println("残念！");
			}else{}
		}
			System.out.println("正解！");
	}
}
