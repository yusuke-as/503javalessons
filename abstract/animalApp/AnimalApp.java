import my.util.*;
import java.util.*;
public class AnimalApp{
	public static void main(String[] args){
		List<Animal> animals=new ArrayList<>();
		String[] type={"犬","豚","猫"};
		Random rand=new Random();
		while(true){
			int select=Common.input("どうする? 1.集める 2.眺める 3.終わり>");
			switch(select){
			case 1:
				int n=rand.nextInt(3);
				Common.print(type[n]+"を見つけました!");
				String name=Common.inputStr("名前をつけてください>");
				switch(n){
				case 0:
					Animal a=new Dog(name);
					animals.add(a);
					break;
				case 1:
					Animal b=new Pig(name);
					animals.add(b);
					break;
				case 2:
					Animal c=new Cat(name);
					animals.add(c);
					break;
				}
				break;
			case 2:
				for(int i=0;i<animals.size();i++){
					animals.get(i).cry();
					if(animals.get(i) instanceof Cat){
						Cat c=(Cat)animals.get(i);
						c.sleep();
						//((Cat)c).sleep;
					}
				}
				break;
			default:
				Common.print("アプリケーションを終了します。");
				return;
			}
		}
	}
}
