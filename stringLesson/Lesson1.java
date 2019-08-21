import my.util.*;
public class Lesson1{
	public static void main(String[] args){
		String input=Common.inputStr("数字をカンマ区切りで入れてね！>");
		String[] nums=input.split(",");
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=Integer.parseInt(nums[i]);
		}
		Common.print("和は"+sum);
	}
}
