import java.util.*;
public class Main{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>();
		//要素の追加addメソッド
		list.add("John");
		list.add("Paul");
		list.add("George");
		list.add("Ringo");
		//sopにlist変数名を渡すと一覧表示
		System.out.println(list);
		//要素数はsize
		System.out.println(list.size());//->4
		//要素取得
		System.out.println(list.get(1));//->Paul
		//for文
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//拡張for文
		for(String s:list){
			System.out.println(s);
		}
		//indexを指定して挿入
		list.add(0,"Bob");//->[Bob,John,Paul,George,Ringo]
		//indexを指定して削除
		list.remove(0);//->[John,Paul,George,Ringo]
		//オブジェクトを指定して削除
		list.remove("John");
		list.remove("George");//->[Paul,Ringo]
		//containsで含まれているかが分かる
		if(list.contains("Paul")){
			System.out.println("含んでいます");
		}
		//要素追加
		list.add("Ono");
		//要素変更
		list.set(2,"Yoko");//->[Paul,Ringo,Yoko]
		//全要素削除
		list.clear();
		if(list.isEmpty()){
			System.out.println("要素はありません");
		}
		//宣言はListインターフェース型で行うことが多い
		//ジェネリクス部分には参照型しか書けない
		//Integer,Double,Float,Boolean,Character
		List<Integer> list2=new ArrayList<>();
		list2.add(3);
		list2.add(10);
		System.out.println(list2);//->[3,10]
		//ListのListもできる
		List<List<Integer>> list3=new ArrayList<>();
		List<Integer> li1=new ArrayList<>();
		li1.add(10);li1.add(20);
		list3.add(li1);
		List<Integer> li2=new ArrayList<>();
		li2.add(100);li2.add(200);
		list3.add(li2);
		System.out.println(list3.get(0).get(1));//->20
	}
}
