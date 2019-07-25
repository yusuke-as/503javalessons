import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] msgs={"くらえっ！","こなくそっ!","これでもかっ!"};
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("CommunicationQuest");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("勇者の名前を入力してください>");
		String name="勇者"+sc.nextLine();
		Hero h=new Hero(name);
		Tomato t1=new Tomato("トマト",20,5);
		Tomato t2=new Tomato("プチトマト",10,3);

		System.out.println(t1.name+"が現れた！");
		System.out.println(t2.name+"が現れた！");
		System.out.println("please press enterkey ...");
		sc.nextLine();
		while(true){
			int n=rand.nextInt(4);
			boolean isAttack=false;
			switch(n){
			case 0:
			case 1:
				int tN=rand.nextInt(2);
				if(tN==0 && t1.isAlive){
					h.attack(t1,msgs[rand.nextInt(msgs.length)]);
					isAttack=true;
				}else if(tN==1 && t2.isAlive){
					h.attack(t2,msgs[rand.nextInt(msgs.length)]);
					isAttack=true;
				}
				break;
			case 2:
				if(t1.isAlive){
					t1.attack(h);
					isAttack=true;
				}
				break;
			case 3:
				if(t2.isAlive){
					t2.attack(h);
					isAttack=true;
				}
				break;
			}
			if(h.isAlive==false){
				System.out.println("勇者はもういない…");
				System.out.println("You Lose…");
				break;
			}
			if(t1.isAlive==false && t2.isAlive==false){
				System.out.println("相手を倒した!!");
				System.out.println("Win!!");
				break;
			}
			if(isAttack){
				System.out.println("*************************");
				if(h.isAlive)h.showStatus();
				if(t1.isAlive)t1.showStatus();
				if(t2.isAlive)t2.showStatus();
				System.out.println("*************************");
				sc.nextLine();
			}
		}
	}
}
