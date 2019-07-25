import java.util.*;
public class arrLesson3{
	public static void main(String[] args){
		int[] num1=new int[5];
		for(int i=0;i<num1.length;i++){
			Random rand=new Random();
			int temp=rand.nextInt(100)+1;
			num1[i]=temp;
		}
		System.out.println("num1"+Arrays.toString(num1));
		int[] num2=new int[5];
		for(int i=0;i<num1.length;i++){
			num2[i]=num1[i]*3;
		}
		System.out.println("num2"+Arrays.toString(num2));
	}
}
