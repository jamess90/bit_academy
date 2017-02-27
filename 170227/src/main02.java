
public class main02 {

	public static void main(String[] args) {

		House2 slidingDoorHouse = new House2(new SlidingDoor2());
		House2 hingedDoorHouse = new House2(new HingedDoor2());
		House2 fingerDoorHouse = new House2(new FingerprintDoor2());
		House2 revolvingDoorHouse = new House2(new RevolvingDoor2());
		

		slidingDoorHouse.in();
		slidingDoorHouse.out();

		hingedDoorHouse.in();
		hingedDoorHouse.out();

		//dsnajknfs
		
		fingerDoorHouse.in();
		fingerDoorHouse.out();

		revolvingDoorHouse.in();
		revolvingDoorHouse.out();
		
	}
	
	double Log(double num){
		Math.log(num);
		return num;
	}
}
