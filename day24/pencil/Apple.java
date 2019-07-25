public class Apple{
	int price;
	//コンストラクタが他にない場合、引数なしのコンストラクタが暗黙で生成される。Apple(){};
	void showStatus(){
		System.out.println(this.price);
	}
}
