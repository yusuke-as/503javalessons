public class ElectricBicycle extends Bicycle{
	static final int MAX=10;
	int battery;
	ElectricBicycle(int i){
		super(i);
		this.battery=MAX;
	}
	@Override
	public void ride(){
		super.ride();
		this.battery-=5;
		if(this.battery<=0){
			System.out.println("バッテリーが切れるととても重いです。");
		}else{
			System.out.println("坂道だってラクラクです。");
		}
	}
	public void batteryCharge(){
		this.battery=MAX;
	}
}
