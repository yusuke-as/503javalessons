public class ArrLesson2{
	public static void main(String[] args){
		int[] data=new int[5];
		System.out.println(data[0]);
		System.out.println(data.length);
		data[0]=100;
		data[4]=150;//date[date.length-1]=150の方が最後感あるよ！！
		data[2]=120;
		data[1]=data[2]-data[0];
		System.out.println(data[1]);
	}
}
