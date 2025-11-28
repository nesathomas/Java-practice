package week2.sunday;

public class Library {


	public String addBook(String bookTitle) {

		System.out.println(bookTitle+ " - Book added successfully");
		return bookTitle;

	}
	
	public void issueBook() {
		
		System.out.println("Book issued succcessfully");
	}
	
	
	public static void main(String[] args) {
		// Methods and Objects in Java 
		
		Library obj = new Library();
		obj.addBook("Plants vs Zombies");
		obj.issueBook();

	}

}
