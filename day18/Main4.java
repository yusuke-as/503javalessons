import java.util.*;
public class Main4{
	public static int[] makeArray(int size){
		int[] newArray=new int[size];
		for(int i=0;i<newArray.length;i++){
			newArray[i]=i;
		}
		return newArray;
	}
	public static void main(String[] args){
		int[] array=makeArray(3);
		for(int i: array){
			System.out.println(i);
		}
		System.out.println(Arrays.toString(array));
	}
}
