package computer;

import computer.cpu.*;
import computer.drive.impl.*;
import computer.ram.impl.*;

public class computerMain {

	public static void main(String[] args) {

		Computer com = new Computer(new I5(), new LgRam(), new HDD());
		
		com.running();
		com.ready();
		com.asleep();
		com.suspended_ready();
		com.suspended_blocked();
		
	}

}
