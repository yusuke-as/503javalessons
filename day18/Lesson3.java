import java.util.*;
public class Lesson3{
	public static void main(String[] args){
		Random rand=new Random();
		final int NUM_COUNT=10;
		int[] nums=new int[NUM_COUNT];
		System.out.print("生成した数値:");
		for(int i=0;i<nums.length;i++){
			int n=rand.nextInt(101);
			System.out.print(n);
			if(i<nums.length-1){//最後の要素以外に,をつける
				System.out.print(",");
			}
			nums[i]=n;
		}
		System.out.print("\n偶数:");
		String evenStr="";
		for(int n:nums){
			if(n%2==0){
				evenStr+=n;
				evenStr+=",";
			}
		}
		evenStr=evenStr.substring(0,evenStr.length()-1);
		System.out.println(evenStr);
	}
}
