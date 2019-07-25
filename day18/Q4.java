import java.util.*;
public class Q4{
	static int[] makeArray(int[] array){
		int[] newArray={array[0]*2,array[1]*2,array[2]*2};
		return newArray;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を3個入力>");
		int[] array={sc.nextInt(),sc.nextInt(),sc.nextInt()};
		System.out.println(Arrays.toString(makeArray(array)));
	}
}
/*
	public static void main(String[] args){
		System.out.print("整数を３つ入力>");
		int[] arr=new int[3];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int[] result=doubleArr(arr);
	}
	public static int[] doubleArr(int[] arr){
		int[] retArray=new int[arr.length];
		for(int i=0;i<retArray.length;i++){
			retArray[i]=
		}
	}
