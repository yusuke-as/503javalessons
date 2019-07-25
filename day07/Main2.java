import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand =new Random();
		int diceA;
		int diceB;
		int count=0;
		do{
			diceA=rand.nextInt(6)+1;
			diceB=rand.nextInt(6)+1;
			count++;
			System.out.printf("サイコロ%d回目%dと%dです%n",count,diceA,diceB);
		}
		while(diceA!=diceB);
		System.out.printf("%d回目でぞろ目%d%dがでました",count,diceA,diceB);
	}
}
