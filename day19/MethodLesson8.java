import java.util.*;
public class MethodLesson8{
	static int[] makearrFirsttoLast(int first,int last){
		int[] retArr=new int[Math.abs(first-last)+1];
		for(int i=0;i<retArr.length;i++){
			/*
			if(first<last){
				retArr[i]=first+1*i;
			}else if(first>last){
				retArr[i]=first-1*i;
			}
			*/
			retArr[i]=first<last ? first++:first--;
		}
		return retArr;
	}
	public static void main(String[] args){
		int x=4,y=-2;
		int[] ans=makearrFirsttoLast(x,y);
		System.out.println(Arrays.toString(ans));
	}
}
