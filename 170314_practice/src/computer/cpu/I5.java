package computer.cpu;

import computer.cpu.impl.ICpu;

public class I5 implements ICpu {

	@Override
	public void use() {
		System.out.println("I5 Cpu ���");
	}

	@Override
	public void unUse() {
		System.out.println("I5 Cpu �̻��");
	}

}
