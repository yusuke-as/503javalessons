public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h){
		int basePoint=10;
		int recovPoint=(int)(basePoint*this.getWand().getPower());
		h.setHP(h.getHP()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した！");
	}
	public int getHP(){
		return this.hp;
	}
	public void setHP(int hp){
		if(hp<0){
			this.hp=0;
		}else{
		this.hp=hp;
		}
	}
	public int getMP(){
		return this.mp;
	}
	public void setMP(int mp){
		if(mp<0){
			throw new IllegalArgumentException("mpの値が不正です。");
		}
		this.mp=mp;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name==null || name.length()<3){
			throw new IllegalArgumentException("名前が不正です。");
		}
		this.name=name;
	}
	public Wand getWand(){
		return this.wand;
	}
	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentException("杖がありません。");
		}
		this.wand=wand;
	}
}
