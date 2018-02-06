
public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("Jamie Fox", 2008, 85477, 45.67);
		Book book2=new Book("Taylor Henry", 2002, 523456.788, 14.88);
		
		System.out.println("First Book Author: "+book1.Author+"\n"+ "Publishing: "+book1.Year+"\n"+"ISBN "+book1.ISBN+"\n"+"Price: "+book1.Price);
		System.out.println("Second Book Author: "+book2.Author+"\n"+ "Publishing: "+book2.Year+"\n"+"ISBN "+book2.ISBN+"\n"+"Price: "+book2.Price);
	}

}
