import java.util.*;
public class Q2{
    public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
         Random rand=new Random();
         int[] nums=new int[]{1,2,3,4,5,6,7,8,9,10};
         int Mother=0;
         int Kids=0;
		 System.out.print("何ターン行いますか(1~5)>");
         int turn=sc.nextInt();
         for(int i=0;i<turn*2;i++){
            if(i%2==0){//Mother引く番
                int index=rand.nextInt(nums.length-i);
                System.out.println((i+1)+"回目Mother"+nums[index]);
                Mother+=nums[index];
            }else{//Kidsが引く番
                int index=rand.nextInt(nums.length-i);
                System.out.println((i+1)+"回目Kids"+nums[index]);
                Kids+=nums[index];
            }
                int temp=nums[index];
                nums[index]=nums[nums.length-1-i];
                nums[nums.length-1-i]=temp;
         }
            System.out.println("Result");
            System.out.println("Mother "+Mother);
            System.out.println("Kids "+Kids);
            if(Kids<Mother){
                System.out.println("Mother Win!");
            }else{
                System.out.println("Kids Win!");
            }
    }
}
