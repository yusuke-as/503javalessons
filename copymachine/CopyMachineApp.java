import my.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		CopyMachine no1=new CopyMachine(Common.input("最初に給紙する枚数を入力してください>"));
		no1.display();
		while(true){
			int n=Common.input("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>");
			switch(n){
			case 1:
				no1.feedPeper(n);
				break;
			case 2:
				int num=Common.input("枚数を入力してください>");
				no1.copy(num);
				break;
			case 3:
				no1.display();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
	}
}
}
