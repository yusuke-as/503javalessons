public class PoisonMatango extends Matango{
	private int poisonAttackCount=5;
	PoisonMatango(char c){
		super(c);
	}
	@Override
	public void attack(Hero h){
		super.attack(h);
		System.out.println(h.getHp());
		if(poisonAttackCount>0){
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage=h.getHp()/5;
			System.out.println(damage+"のダメージ");
			h.setHp(h.getHp()-damage);
			poisonAttackCount--;
		}
	}
}
