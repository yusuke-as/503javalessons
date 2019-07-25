import java.util.*;
public class Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("英語で10月は何ですか(頭大文字)？>>");
		String ans =sc.nextLine();
		if(ans.equals("October")){
			System.out.print("OK!!!");
		}else{
			System.out.print("NG.......");
		}
	}
}
