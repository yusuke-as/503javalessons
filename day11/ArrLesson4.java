import java.util.*;
public class ArrLesson4{
	public static void main(String[] args){
		int[] arrA={4,8,10};
		int[] arrB=new int[]{7,1,3};
		for(int i:arrA){
			System.out.println(i);
		}
		int[] arrC=new int[3];
		for(int j=0;c<arrC.length;j++){
			arrC[j]=arrA[j]*2;
		}
		System.out.println(Arrays.toString(arrC));
		for(int k=0;c<arrC.length;k++){
			arrC[k]=arrC[k]+arrB[k];
		}
		System.out.println(Arrays.toString(arrC));
		int sum=0;
		for(int a:arrC){
			sum+=a;
		}
		System.out.println("合計は"+sum+"です");

	}
}
