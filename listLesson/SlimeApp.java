public class SlimeApp{
	public static void main(String[] args){
		Slime surarin=new Slime();
		surarin.setName("スラリン");
		surarin.appear();
		Slime surakiti=new Slime();
		surakiti.setName("スラキチ");
		surakiti.appear();
		Slime suratti=new Slime("スラッチ");
		suratti.appear();
		System.out.println(Slime.getTotalCount()+"匹のスライム軍団が襲いかかってきた!");
		Slime[] slimes=new Slime[Slime.getTotalCount()];
		slimes[0]=surarin;
		slimes[1]=surakiti;
		slimes[2]=suratti;
		for(Slime s:slimes){
			s.attack();
		}
	}
}
