package week2.sunday;



public class LibraryManagement extends Library {

	public static void main(String[] args) {

/*
 * Create an object for the Library class in the main method of LibraryManagement.
 * Call both methods of the Library class from LibraryManagement and execute
 */
		
		LibraryManagement lib = new LibraryManagement();
		lib.addBook("DogMan");
		lib.issueBook();
		
	}

}
