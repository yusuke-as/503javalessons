import java.util.*;
public class Q6{
    public static void main(String[] args){
        System.out.print("数当てゲーム");
        Random rand=new Random();
        int ans=rand.nextInt(10);
        for(int i=0;i<5;i++){
            System.out.println("0~9の数字を入力してください");        
            Scanner scanner=new Scanner(System.in);
            int  num=scanner.nextInt();
            if(ans==num){
                System.out.println("アタリ！！！！！！！！！！！");
                break;
            }
            System.out.println("はずれ！");
        }
        System.out.println("ゲームを終了します");

    }
}
