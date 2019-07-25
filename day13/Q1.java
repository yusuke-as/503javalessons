import java.util.*;
public class Q1{
	public static void main(String[] args){
		int[] nums=new int[]{1,2,3,4,5};
		Random rand=new Random();
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++){
			int n=rand.nextInt(nums.length-i);
			int temp;
			temp=nums[n];
			nums[n]=nums[nums.length-1-i];
			nums[nums.length-1-i]=temp;
		}
		System.out.println("shuffle…"+Arrays.toString(nums));
	}
}
