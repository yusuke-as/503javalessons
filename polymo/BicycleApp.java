import my.util.*;
import java.util.*;
public class BicycleApp{
	public static void main(String[] args){
		Common.print("自転車を選んでください");
		Bicycle b=new Bicycle(27);
		ElectricBicycle eb=new ElectricBicycle(24);
		while(true){
			System.out.printf("0:自転車/ホイールサイズ:%d%n",b.wheelSize);
			System.out.printf("1:電動自転車/ホイールサイズ:%d バッテリー:%d%n",eb.wheelSize,eb.battery);
			System.out.println("2:終了");
			int select=Common.input("番号を入力してください");
			switch(select){
			case 0:
				while(true){
					int n=Common.input("1/走る,2/降りる>");
					switch(n){
					case 1:
						b.ride();
						continue;
					case 2:
						b.getOff();
						break;
					}
					break;
				}
				break;
			case 1:
				while(true){
					int l=Common.input("1/走る,2/降りる,3/充電>");
					switch(l){
					case 1:
						eb.ride();
						continue;
					case 2:
						eb.getOff();
						break;
					case 3:
						System.out.println("バッテリーを充電しました");
						eb.batteryCharge();
						continue;
					}
					break;
				}
				break;
			case 2:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
