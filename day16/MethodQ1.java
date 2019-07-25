import java.util.*;
public class MethodQ1{
	static void printSquare(char c, int width){
		for(int i=0;i<width;i++){
			for(int k=0;k<width;k++){
			System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("一文字>>");
		String str=sc.nextLine();
		char a=str.charAt(0);
		System.out.print("幅は？>>");
		int width=sc.nextInt();
		printSquare(a,width);
	}
}
