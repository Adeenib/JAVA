
public class Author implements Comparable <Author>{
	String firstName;
	String lastName;
	String bookName;
	
	public Author(String firstName, String lastName, String bookName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		
		
		return this.firstName.compareTo(o.firstName);
	}
	

}
