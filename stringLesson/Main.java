import my.util.*;
public class Main{
	public static void main(String[] args){
		String str="abcdefgh";
		Common.print(str.length());//文字列の長->8
		Common.print(str.startsWith("a"));//その文字から始まる？->true
		Common.print(str.endsWith("g"));//その文字で終わる？->false
		Common.print(str.substring(0,3));//部分文字列の作成->abc
		Common.print(str.substring(4));//引数ひとつはそこから後ろ->efgh
		Common.print(str.replace("f",":"));//置換(before,after)->abcde:gh
		String[] data=str.split("d");//指定文字で分割して配列を作成->
		Common.print(data[0]);//->abc
		Common.print(data[1]);//->efgh

		Common.print(str);//いろいろやっても元は変わらない->abcdefgh
	}
}
