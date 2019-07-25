public class NamePower {
	public static void main (String[] args){
		char a='芦';
		char b='刈';
		char c='夕';
		char d='祐';
		System.out.println("合計は"+(a+b+c+d));
		System.out.println("平計は"+((double)(a+b+c+d)/4));
		System.out.println("各点は"+"芦"+(int)a);
		System.out.println("　　　"+"刈"+(int)b);
		System.out.println("　　　"+"夕"+(int)c);
		System.out.println("　　　"+"祐"+(int)d);
		int max = Math.max(Math.max(a,b),Math.max(c,d));
		System.out.println("最高点は"+max+"です");
	}
}
