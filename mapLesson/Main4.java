import java.util.*;
import my.util.*;
public class Main4{
	public static void main(String[] args){
		Map<Integer,Integer> map=new HashMap<>();
		int count;
		for(int i=1;i<=100;i++){
			count =Common.rand(1,100);
			if(map.containsKey(count)){
				map.put(count,map.get(count)+1);
			}else{
				map.put(count,1);
			}
		}
		Common.print("1-100の乱数を100回発生させたよ");
		Common.print("***result***");
		Common.print(map.size()+"種類の数値が出ました。");
		for(int i=1;i<100;i++){
			if(map.containsKey(i)){
				Common.print(i+"..."+map.get(i));
			}
		}
	}
}
