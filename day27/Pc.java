public class Pc{
	String maker;
	int price;
	static int totalPc;
	Pc(String maker,int price){
		this.maker=maker;
		this.price=price;
		totalPc++;
	}
	void showStatus(){
		System.out.printf("メーカー:%s 価格:%d %n",this.maker,this.price);
	}
	static void total (){
		System.out.printf("トータル台数は%d台です。%n",totalPc);
	}
	
}
