import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("何行にしますか？>>");
		int row=sc.nextInt();
		System.out.print("何列にしますか？>>");
		int col=sc.nextInt();
		int[][] data=new int[row][col];

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				data[i][j]=rand.nextInt(100);
			}
		}
		for(int[] arr:data){
			for(int n:arr){
				System.out.printf("%3d",n);
			}
			System.out.println();
		}
	}
}
