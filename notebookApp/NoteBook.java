public class NoteBook extends Book{
	private String contents="";
	public NoteBook(int a,int b){
		super(a,b);
	}
	public void write(String s){
		this.contents+=s;
	}
	@Override
	public void showStatus(){
		super.showStatus();
		System.out.println("内容:"+this.contents);
	}
}
