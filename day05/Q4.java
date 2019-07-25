import java.util.*;
public class Q4{
    public static void main(String[] args){
       	Random rand=new Random();
		int num = rand.nextInt(100);
			System.out.printf("出た数は%dです。%n",num);
        if(num==0){
        	System.out.print("1%のURがでました！");
        }else if(num<6){
        	System.out.print("5%のSRがでました！");
        }else if(num<40){
        	System.out.print("34%のRがでました！");
        }else{
            System.out.print("60%のNがでました…");
        }
    }
}
