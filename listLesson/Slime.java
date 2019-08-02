public class Slime{
	private String name;
	private int hp;
	private static int totalCount;
	public Slime(){
		totalCount++;
	}
	public Slime(String name){
		this();
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public static int getTotalCount(){
		return totalCount;
	}
	public void appear(){
		System.out.println(this.name+"が現れた!");
	}
	public void attack(){
		System.out.println(this.name+"の攻撃:5ポイントのダメージを与えた!");
	}
}
