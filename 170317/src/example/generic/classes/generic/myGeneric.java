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

	// method ȣ��� Ÿ���� �����ϴ� ���׸��� ����� �ִ�.
	public <K> K foo(K k) {
		return k;
	}

	@Override
	public String toString() {
		return t.toString() + " " + u.toString();
	}

}