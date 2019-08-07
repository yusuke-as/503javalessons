import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class After100{
	public static void main(String[] args){
		Date d=new Date();
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		int day=c.get(Calendar.DAY_OF_MONTH);
		day+=100;
		c.set(Calendar.DAY_OF_MONTH,day);
		Date dayAfter =c.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(sdf.format(dayAfter));
	}
}
