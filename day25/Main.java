import my.util.*;
public class Main{
	public static void main(String[] args){
		int A=Common.input("整数A>");
		int B=Common.input("整数B>");
		Common.print("合計は"+(A+B)+((A+B)%2==0 ? "偶数":"奇数")+"です");
	}
}
