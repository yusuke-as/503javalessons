public class Main{
	public static int add(int x,int y){
		return x+y;
	}
	public static double add(double x,double y){
		return x+y;
	}
	public static String add(String x,String y){
		return x+y;
	}
	public static void main(String[] args){
		System.out.println(add(10,20));
		System.out.println(add(3.5,2.7));
		System.out.println(add("Hello","World"));
		System.out.println(add(3.5,10));//10はint型だがdoubleの箱の方がでかいから2番目で処理!!
	}
}

