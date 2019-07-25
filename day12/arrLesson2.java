import java.util.*;
public class arrLesson2{
	public static void main(String[] args){
		int[] num={3,8,10,5,4,};
		for(int n=0;n<num.length;n++){
			num[n]*=2;
		}
		for(int n:num){
			System.out.println(n);
		}
		System.out.println(Arrays.toString(num));
	}
}
