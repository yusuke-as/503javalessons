import java.util.*;
public class Q3{
	static double cal(double bottom,double height){
		double ans=bottom*height/2;
		return ans;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("底辺>");
		double bottom=sc.nextDouble();
		System.out.print("高さ>");
		double height=sc.nextDouble();
		double area=cal(bottom,height);
		System.out.printf("底辺:%f,高さ:%fの三角形の面積は%fです。%n",bottom,height,area);
		System.out.println("底辺:"+bottom+",高さ:"+height+"の三角形の面積は"+area+"です。");
	}
}
