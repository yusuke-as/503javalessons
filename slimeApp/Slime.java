public class Slime{
	String name="noName";
	int hp;
	boolean isAlive=true;
	Slime(){
		this.hp=10;
	}
	Slime(String name){
		this();
		this.name=name;
	}
	Slime(String name,int hp){
		this(name);
		this.hp=hp;
	}
	void appear(){
		System.out.println(this.name+"が現れた!");
	}
	void attack(Slime other){
		System.out.println(this.name+"が攻撃");
		System.out.println(other.name+"に3ポイントのダメージ!");
		other.hp-=3;
		if(other.hp<=0){
			other.isAlive=false;
			System.out.println(other.name+"は倒れた!");
		}
	}
	void showStatus(){
		System.out.printf("name:%s%nhp:%s%n",this.name,this.hp);
	}
}
