public class Main{
	public static void main(String[] args){
		int[] arr={2,4,6,8,77,2,3,5,32,325,};
		System.out.println(arr[0]);
		arr[2]=10;
		arr[arr.length-1]=30;
		arr[arr.length-2]=10;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
		/*
		for(int j:arr){
			sum+=j;
		}
		*/
		double ave=(double)sum/arr.length;
		System.out.printf("%.1f%n",ave);
		int max=arr[0];
		for(int k=1;k<arr.length;k++){
			if(max<arr[k]){
				max=arr[k];
			}	
		}
		System.out.println("最大値は"+max);
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("最小値は"+min);
		boolean isHit=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==77){
				System.out.printf("index%dに77がありました%n",i);
				isHit=true;
				break;
			}
		}
		int idx=0;
		for(;idx<arr.length;idx++){
			if(arr[idx]==77){
				System.out.printf("index%dに77がありました%n",idx);
				break;
			}
		}
		if(idx==arr.length){
			System.out.println("77はありませんでした");
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		/*for(int i=0;i<arr.length;*/
	}
}
