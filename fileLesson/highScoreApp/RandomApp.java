import java.io.*;
import java.util.*;
import my.util.*;
public class RandomApp{
	public static void main(String[] args) throws Exception{
		List<Score> list=new ArrayList<>();
		FileInputStream fis=new FileInputStream("record.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line=br.readLine();
		String[] records=line.split(",");
		Score s=new Score(Integer.parseInt(records[0]));
		int HighScore=Integer.parseInt(records[0]);

		Common.print("*****乱数ゲーム*****");
		if(HighScore==0){
			Common.print("HighScore"+0);
		}else{
			Common.print("HighScore"+HighScore+" "+records[1]);
		}
		while(true){
			String choice=Common.inputStr("やりますか yes...y no...n >>");
			switch(choice){
			case "y":
				int score=Common.rand(100000)+1;
				Common.print(score);
				if(score>HighScore){
					Common.print("new Record");
					HighScore=score;
				}
				break;
			case "n":
				Score sc=new Score(HighScore);
				list.add(sc);
				FileOutputStream fos=new FileOutputStream("record.csv");
				OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
				BufferedWriter bw=new BufferedWriter(osw);
				bw.append(sc.toCSV());
				bw.close();
				Common.print("アプリケーションを終了します。");
				return;
			default:
				continue;
			}
		}
	}
}
