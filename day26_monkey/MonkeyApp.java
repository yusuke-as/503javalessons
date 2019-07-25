import java.util.*;
import my.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		String name=Common.inputStr("おさるの名前を決めてください>");
		int age=Common.input("おさるの歳を決めてください>");
		Monkey monkey=new Monkey(name,age);
		while(true){
			int n=Common.input("おさるにおさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			switch(n){
			case 1:
				monkey.greet();
				break;
			case 2:
				monkey.takeuma();
				break;
			case 3:
				monkey.sakadachi();
				break;
			default:
				Common.print("アプリケーションを終了します");
				return;
			}
		}
	}
}
