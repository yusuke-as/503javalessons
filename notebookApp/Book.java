public class Book{
	private int pages;
	private int price;
	public Book(int a,int b){
		this.pages=a;
		this.price=b;
	}
	public void showStatus(){
		System.out.println("page:"+this.pages);
		System.out.println("price:"+this.price);
	}
}
