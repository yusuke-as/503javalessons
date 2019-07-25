public class Main2 {
	public static void main (String[] args){
		int a;
		a=100;
		int y= a++ + a;//100+101で201に;
		System.out.println(y);
		int x=a+(++a);//変数の評価は左からするので100+101に;
		System.out.println(x);
		int z=a+(a++);//変数の評価は左からするので100+100に;
		System.out.println(z);
	}
}
