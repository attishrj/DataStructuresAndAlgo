package comparable.vs.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAuthByNames {

	public static void main(String[] args) {
		List<Author> al=new ArrayList<Author>();
		al.add(new Author("Ian","Miller", "Tropic of Cancer"));  
	      al.add(new Author("Ian","Hopkinson", "Brown Girl in the Ring"));
	      al.add(new Author("Frank","Miller", "300"));
	      al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
	      al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
	      
	      
	      Collections.sort(al);  
	      for(Author str:al){  
	    	  System.out.println(str.firstName+" "+
	          str.lastName+" "+"Book: "+str.bookName);  
	      } 

	}

}
