import java.util.*;
public class Main3{//参照(値)渡し
	public static void main(String[] args){
		int[] arr={1,2,3};
		hoge(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void hoge(int[] arr){
		arr[0]=100;
	}
}
