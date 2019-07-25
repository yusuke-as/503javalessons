import java.util.*;
public class test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("何回サイコロを振りますか？>>");
		int times=sc.nextInt();
		for(int i=1;i<=times;i++){
			Random rand=new Random();
			int dice=rand.nextInt(6)+1;
			System.out.print(dice+" ");
		}
	}
}
