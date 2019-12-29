package comparable.vs.comparator;

public class Generic<T> {
	T obj;

	public Generic(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}

	void show() {
		System.out.println(getObj().getClass().getName());
	}
}
