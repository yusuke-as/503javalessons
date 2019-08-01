public class Computer extends TangibleAsset{
	private String makerName;
	@Override
	public Computer(String name,int price,String color,String makerName){
		super(name,price,color);
		this.makerName=makerName;
	}
	public String makerName(){
		return this.makerName;
	}
}
