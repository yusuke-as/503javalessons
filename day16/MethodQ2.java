import java.util.*;
public class MethodQ2{
/*	static String changeWords(String s){
		
		for(int i=0;i<s.length()/2;i++){
			char temp=s.charAt(i);
			s.charAt(i)=s.charAt(s.length()-1-i);
			s.charAt(s.length()-1-i)=temp;
		}
		String str=String.valueOf(s);
		return str;
		*/
	
	static String reverse(String str){
		String s ="";
	 	for(int i=str.length()-1;i>=0;i--){
	  		s+=str.charAt(i);
	  	}
	  	return s;
	}	
		

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("文字列を入力してください>>");
		String words=sc.nextLine();
		words=reverse(words);//文字列の入れ替え処理
		System.out.println(words);
	}
}
