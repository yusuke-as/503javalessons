import java.util.*;
public class Lesson3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("何クラスありますか？>>");
		int group=sc.nextInt();
		int[][] classScores=new int[group][];
		int people=0;
		for(int i=0;i<group;i++){
			System.out.print(i+1+"組には何人いますか？>>");
			people=sc.nextInt();
			classScores[i]=new int[people];
		}

		for(int i=0;i<group;i++){
			for(int j=0;j<classScores(i).length;j++){
				classScores[i][j]=rand.nextInt(101);
			}
		}
		System.out.printf("%nresult%n");

		for(int[] arr:classScores){
			for(int n:arr){
				System.out.printf("%3d",n);
			}
			System.out.println();
		}
	}
}
