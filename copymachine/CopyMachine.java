public class CopyMachine{
	int peper;
	CopyMachine(int sheet){
		this.peper=sheet;
		if(sheet<=0){
			this.peper=0;
		}
	}
	void feedPeper(int sheet){
		System.out.println(sheet+"枚給紙しました。");
		peper+=sheet;
	}
	void copy(int sheet){
		if(peper-sheet<=0){
			System.out.println(peper+"枚コピーしました。");
		}else{
		System.out.println(sheet+"枚コピーしました。");
		peper-=sheet;
		}
	}
	void display(){
		System.out.println("コピー可能な枚数は"+peper+"枚です。");
	}
}
