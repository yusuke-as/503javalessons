public class Main5{
	public static void main(String[] args){
		try{
			Integer.parseInt("三");
		}catch(NumberFormatException e){
			System.out.println("数値型で入力してください");
		}
	}
}
