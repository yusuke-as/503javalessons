public class MainArray2{
	public static void main(String[] args){
		int[] score={20,30,40,50,80};
		for(int i=0;i<score.length;i++){
			System.out.println(score[i]);
		}
		for(int value:score){
			System.out.println(value);
		}
	}
}
