package computer;

import computer.cpu.impl.ICpu;
import computer.drive.IDrive;
import computer.ram.IRam;

public class Computer {

	private ICpu cpu;
	private IRam ram;
	private IDrive drive;

	private String process_state;

	private enum Process {
		running, ready, asleep, suspended_ready, suspended_blocked
	}

	Process state;

	public Computer(ICpu cpu, IRam ram, IDrive drive) {
		assemble(cpu, ram, drive);
		state = Process.suspended_blocked;
	}

	public void assemble(ICpu cpu, IRam ram, IDrive drive) {
		this.cpu = cpu;
		System.out.println("CPU ÀåÂø");

		this.ram = ram;
		System.out.println("RAM ÀåÂø");

		this.drive = drive;
		System.out.println("DRIVE ÀåÂø");
		System.out.println();
	}

	public void running() {

		state = Process.running;
		change_state_print();
		cpu.use();
		ram.wakeUp();
		drive.swapIn();
		System.out.println();
	}

	public void ready() {

		state = Process.ready;
		change_state_print();
		cpu.unUse();
		ram.wakeUp();
		drive.swapIn();
		System.out.println();
	}

	public void asleep() {

		state = Process.asleep;
		change_state_print();
		cpu.unUse();
		ram.sleepIn();
		drive.swapIn();
		System.out.println();
	}

	public void suspended_ready() {

		state = Process.suspended_ready;
		change_state_print();
		cpu.unUse();
		ram.wakeUp();
		drive.swapout();
		System.out.println();
	}

	public void suspended_blocked() {

		state = Process.suspended_blocked;
		change_state_print();
		cpu.unUse();
		ram.sleepIn();
		drive.swapout();
		System.out.println();
	}

	private void change_state_print() {

		if (state == Process.running) {
			process_state = "Running";
		} else if (state == Process.ready) {
			process_state = "Ready";
		} else if (state == Process.asleep) {
			process_state = "Asleep";
		} else if (state == Process.suspended_ready) {
			process_state = "Suspended_ready";
		} else {
			process_state = "Suspended_blocked";
		}
		System.out.println("<state : " + process_state + ">");
	}
}
