public class Main3{
	public static void main(String[] args){
		System.out.println(add(add(10,20),add(30,40)));
	}
	public static int add(int a,int b){
		int ans=a+b;
		return ans;
	}
}
