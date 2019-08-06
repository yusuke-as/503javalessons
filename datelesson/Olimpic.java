import java.util.*;
import java.text.SimpleDateFormat;
public class Olimpic{
	public static void main(String[] args){
		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		String s=sdf.format(now);
		System.out.println("今日は"+s);
		Calendar c=Calendar.getInstance();
		c.set(2020,6,24);
		Date olimpic=c.getTime();
		System.out.println(olimpic);
		long nowTime=now.getTime();
		long olimpicTime=olimpic.getTime();
		long dateDiff=(olimpicTime-nowTime)/(1000*60*60*24);
		System.out.println("東京オリンピックはあと"+dateDiff+"日で開催されます。");

	}
}
