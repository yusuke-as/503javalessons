public class Person{
	int age;
	public void setAge(int age){
		if(age<0){
			throw new IllegalArgumentException
				("年齢は正の整数を入力すべきです。指定値="+age);
		}
		this.age=age;
	}
}
