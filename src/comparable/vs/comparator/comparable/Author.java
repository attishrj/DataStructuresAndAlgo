package comparable.vs.comparator.comparable;

public class Author implements Comparable<Author> {
	String firstName;
	String lastName;
	String bookName;
	

	public Author(String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}


	@Override
	public int compareTo(Author name) {
		int fNmae=this.firstName.compareTo(name.firstName);
		return fNmae==0?this.lastName.compareTo(name.lastName):fNmae;
	}

}
