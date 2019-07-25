import java.util.*;
public class Q4_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("整数>");
        int num=sc.nextInt();
        for(int i=num-1;i>=1;i--){
            num*=i;
        }
        System.out.println(num);
    }
}
