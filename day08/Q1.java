import java.util.*;
public class Q1{
	public static void main(String[] args){
		long peper=1L;
		int count=0;
		long goal=384400L*1000*1000;
		do{
			count++;
			peper*=2;
				System.out.printf("折り曲げ%d回目、%,3d㎜です。%n",count,peper);
		}while(peper<goal);
			System.out.printf("折り曲げ%d回目、%,3d㎜で月までの距離%,3d㎜に到達しました",count,peper,goal);

	}
}
