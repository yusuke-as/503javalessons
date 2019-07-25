import java.util.*;
public class Q7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("数値を入力してください>>");
        int max=sc.nextInt();
        int num=2;
        while(num<=max){
            System.out.println(num);
            num+=2;
        }
    }
}
