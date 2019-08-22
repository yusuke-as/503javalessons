import java.util.*;
import java.text.*;
public class Score{
	private int HighScore;
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
	String day=sdf.format(d);

	public Score(int n){
		this.HighScore=n;
	}
	public String toCSV(){
		return String.format("%d,%s",this.HighScore,day);
	}
}
