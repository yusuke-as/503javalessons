public class Hero{
	private String name;
	private int hp;
	public Hero(){
		this.name="勇者";
		this.hp=100;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getHP(){
		return this.hp;
	}
	public void setHP(int hp){
		this.hp=hp;
	}
}
