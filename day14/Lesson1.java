public class Lesson1{
	public static void main(String[] args){
		int[][] nums =new int[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
			nums[i][j]=(i+1)*(j+1);
			System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
	}
}		/*  for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.printf("%3d",data[i][j]);
            }
            System.out.println()*/
		/*
        for(int[] arr:data){
            for(int n:arr){
                System.out.printf("%3d",n);
            }
            System.out.println();
        }*/

