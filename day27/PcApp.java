public class PcApp{
	public static void main(String[] args){
		Pc p1=new Pc("hp",30000);
		Pc p2=new Pc("toshiba",50000);
		p1.price=32000;
		p1.showStatus();
		p2.showStatus();
		Pc.total();
	}
}
