public class Main2{
	public static void main(String[] args){
		int[]a=new int[]{1,2,3};//aが住所3333メモリを作成し1,2,3を保持
			a=null;//aがどこの住所も指定しなくなる
			a[0]=10;//aがnull値を参照するので、参照先エラーになる→住所3333はゴミ箱へ
	}				//nullが使えるのは参照型だけ！！
}
