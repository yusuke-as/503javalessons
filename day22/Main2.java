public class Main2{
	public static void main(String[] args){
		Hero h1=new Hero();
		h1.name="ミナト";
		h1.hp=100;
		Hero h2=new Hero();
		h2.name="アサカ";
		h2.hp=100;
		Wizard w=new Wizard();
		h2.name="スワガラ";
		w.hp=50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}
