public class Main4{
	public static void main(String[] args){
		try{
			String s=null;
			s.length();
		}catch(NullPointerException e){
			System.out.println("NullPointerException例外をcatchしました。");
			System.out.println("--スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)--");
		}
	}
}
