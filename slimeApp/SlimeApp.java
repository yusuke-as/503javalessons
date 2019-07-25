import java.util.*;
import my.util.*;
public class SlimeApp{
	public static void main(String[] args)throws Exception{
		String name=Common.inputStr("あなたのスライムの名前を決めてね>");
		Random rand=new Random();
		int hp=rand.nextInt(8)+8;
		Common.print("あなたのスライムが誕生しました!");	
		Slime slime=new Slime(name,hp);
		slime.showStatus();
		Thread.sleep(300);
		Common.print(".");
		Thread.sleep(300);
		Common.print(".");
		Thread.sleep(300);
		Common.print(".");
		Slime other=new Slime("スラリン");
		other.appear();
		while(true){
			int turn=rand.nextInt(2);
			Common.print("");
			switch(turn){
			case 0:
			slime.attack(other);
				if(other.isAlive==false){
					Common.print("YOU WIN!!");
					return;
				}
			case 1:
			other.attack(slime);
				if(slime.isAlive==false){
					Common.print("you lose...");
					return;
				}
			}
			Common.print("-------");
			slime.showStatus();
			other.showStatus();
			Common.print("-------");
		}
	}
}
