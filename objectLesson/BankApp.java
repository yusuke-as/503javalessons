public class BankApp{
	public static void main(String[] args){
		Bank b1=new Bank("1111",1592);
		System.out.println(b1);
		Bank b2=new Bank("2222",9123);
		System.out.println(b2);

		if(b1.equals(b2)){
			System.out.println("同じです。");
		}else{
			System.out.println("違います。");
		}

		Bank b3=new Bank("  2222  ",123456);
		if(b2.equals(b3)){
			System.out.println("同じです。");
		}else{
			System.out.println("違います。");
		}

		Bank b4=b1;
		if(b1.equals(b4)){
			System.out.println("同じです。");
		}else{
			System.out.println("違います。");
		}

	}
}
