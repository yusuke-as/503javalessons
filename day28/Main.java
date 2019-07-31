import my.util.*;
public class Main{
	public static void main(String[] args){
		Hero h=new Hero();
		System.out.println("名前:"+h.getName()+"HP:"+h.getHP());
		System.out.println();
		Wizard w=new Wizard();
		String wizName=Common.inputStr("魔法使いの名前を入力してください>");
		w.setName(wizName);
		int wizHP=Common.input("魔法使いのHPを入力してください>");
		w.setHP(wizHP);
		System.out.println("名前:"+w.getName()+" HP:"+w.getHP());
		System.out.println();
		Wand wan=new Wand();
		String wandName=Common.inputStr("杖の名称を入力してください>");
		wan.setName(wandName);
		int wandPower=Common.input("杖の魔力を入力してください>");
		wan.setPower(wandPower);
		System.out.println("杖:"+wan.getName()+" パワー:"+wan.getPower());
		System.out.println();
		w.setWand(wan);
		w.heal(h);
		System.out.println("名前:"+h.getName()+"HP:"+h.getHP());
	}
}
