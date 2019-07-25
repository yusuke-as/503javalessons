import java.util.*;
public class Q4{
	static int ans(int a,int b,int c){
		int[] num={a,b,c};
		for(int i=0;i<num.length-1;i++){
			if(num[0]<num[i+1]){
				int temp=num[0];
				num[0]=num[i+1];
				num[i+1]=temp;
			}
		}
		return num[0];
	}
	/*
	 * public static int maxOf(int a,int b,int c){
  4         int max=a;
  5         if(b>max){
  6             max=b;
  7         }
  8         if(c>max){
  9             max=c;
 10         }
 11         return max;
 12     }
 13     public static int maxOf2(int a,int b,int c){
 14         return Math.max(Math.max(a,b),c);
 15     }
*/
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数A>");
		int A=sc.nextInt();
		System.out.print("整数B>");
		int B=sc.nextInt();
		System.out.print("整数C>");
		int C=sc.nextInt();
		int max=ans(A,B,C);
		System.out.println("最大値は"+max+"です。");
	}
}

