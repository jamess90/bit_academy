package abstract_class;

public abstract class AA {

	int n;

	public AA(int n) {
		this.n = n;
	}
	

	protected abstract void foo();
	
	protected void goo(){
		System.out.println("A_GOO()");
	}
}
