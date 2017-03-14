package computer.cpu;

import computer.cpu.impl.ICpu;

public class I5 implements ICpu {

	@Override
	public void use() {
		System.out.println("I5 Cpu 사용");
	}

	@Override
	public void unUse() {
		System.out.println("I5 Cpu 미사용");
	}

}
