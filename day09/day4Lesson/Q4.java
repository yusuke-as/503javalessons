import java.util.*;
public class Q4{
	public static void main(String[] args){
		Random rand=new Random();
		int dice1=rand.nextInt(6)+1;
		int dice2=rand.nextInt(6)+1;
		if(dice1==dice2){
			System.out.printf("dice1:%d、dice2:%d,score:%d",dice1,dice2,(dice1+dice2)*2);
		}else{
			System.out.printf("dice1:%d、dice2:%d,score:%d",dice1,dice2,dice1+dice2);
		}
	}
}
