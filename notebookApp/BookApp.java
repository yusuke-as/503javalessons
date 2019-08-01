import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力してください>");
		int pages=sc.nextInt();
		System.out.print("本の価格を入力してください>");
		int price=sc.nextInt();
		Book b=new Book(pages,price);
		System.out.print("ノートのページ数を入力してください>");
		int pages2=sc.nextInt();
		System.out.print("ノートの価格を入力してください>");
		int price2=sc.nextInt();
		NoteBook nb=new NoteBook(pages2,price2);
		while(true){
			System.out.println("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				b.showStatus();
				break;
			case 2:
				nb.showStatus();
				break;	
			case 3:
				System.out.print("書き込む内容を入力してください>");
				String s=sc.next();
				nb.write(s);
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
