public class Lesson4{
	public static void main(String[] args){
		String str="Hello";
		String str2=str.substring(1,4);
		System.out.println(str);//Hello
		System.out.println(str2);//ell

		String str3="abcdefghijklmnopqrstuvwxyz";
		//最後の一文字を削除した新しい文字列を返す
		String str4=str3.substirng(0,str3.length-1);
	}
}
