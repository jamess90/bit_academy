package example.generic.classes.generic;

public class myGeneric<T, U> {

	private T t;
	private U u;

	public myGeneric(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}

	// method 호출시 타입을 지정하는 제네릭을 만들수 있다.
	public <K> K foo(K k) {
		return k;
	}

	@Override
	public String toString() {
		return t.toString() + " " + u.toString();
	}

}