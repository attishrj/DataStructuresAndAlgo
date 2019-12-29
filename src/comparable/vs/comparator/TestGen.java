package comparable.vs.comparator;

public class TestGen {

	public static void main(String[] args) {
		
		Generic<String> stringObj=new Generic<String>("abc");
		stringObj.show();
		System.out.println(stringObj.getObj());
		
		Generic<Integer> intObj=new Generic<Integer>(12);
		intObj.show();

	}

}
