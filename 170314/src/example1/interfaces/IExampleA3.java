package example1.interfaces;

public interface IExampleA3 extends IExampleA, IExampleA2 {
	
	void moo();	// 묵시적으로 public abstract가 분는다.
					// public abstract void moo();
	
}
