public class Main2{//値渡し
	public static void main(String[] args){
		int x=10;
		hoge(x);
		System.out.println(x);
	}
	public static void hoge(int x){
		x--;
		System.out.println("x"+x);
	}
}
