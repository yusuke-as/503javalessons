public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		System.out.println(h.getHp());	
		Matango m=new Matango('B');
		m.attack(h);
		System.out.println(h.getHp());	
		PoisonMatango pm =new PoisonMatango('A');
		pm.attack(h);
	}
}
