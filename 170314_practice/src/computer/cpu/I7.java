package computer.cpu;

import computer.cpu.impl.ICpu;

public class I7 implements ICpu {

	@Override
	public void use() {
		System.out.println("I7 Cpu ���");
	}

	@Override
	public void unUse() {
		System.out.println("I7 Cpu �̻��");
	}

}
