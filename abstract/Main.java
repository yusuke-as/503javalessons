public class Main{
	public static void main(String[] args){
		Matango m=new Matango('A');
		Dancer d=new Dancer();
		d.name="ダンサー";
		d.dance();
		d.run();
		d.attack(m);
		Hero h=new Hero();
		h.name="勇者";
		h.slip();
		h.attack(m);
		h.run();
	}
}
