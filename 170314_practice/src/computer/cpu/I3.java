package computer.cpu;

import computer.cpu.impl.ICpu;

public class I3 implements ICpu {

	@Override
	public void use() {
		System.out.println("I3 Cpu ���");
	}

	@Override
	public void unUse() {
		System.out.println("I3 Cpu �̻��.");
	}

}
