import java.util.*;
import my.util.*;
public class Lesson2{
	public static void main(String[] args){
		Common.print("ArrayListを使ってみよう!");
		Common.print("Listにスライムを追加していってみよう。");
		List<Slime> slimes=new ArrayList<>();
		while(true){
			int n=Common.input("スライムを追加する？(1...yes,2...no):");
			if(n==1){
				String name=Common.inputStr("追加するスライムの名前を決めてね:");
				Slime s=new Slime(name);
				s.appear();
				slimes.add(s);
			}else{
				break;
			}
		}
		for(Slime s:slimes){
			s.attack();
		}
	}
}
