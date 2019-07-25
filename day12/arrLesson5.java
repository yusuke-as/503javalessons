import java.util.*;
public class arrLesson5{
	public static void main(String[] args){
		int[] nums={3,8,10,5,4};
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++){//基準点
			for(int j=i+1;j<nums.length;j++){//比較対象
				if(nums[i]>nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println("昇順…"+Arrays.toString(nums));
	}
}
