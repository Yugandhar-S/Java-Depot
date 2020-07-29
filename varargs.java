package testPack;

class FourWheeler{
	void start() {
		System.out.println("Basic start");
	}
}
class Car extends FourWheeler{
	void start() {
		super.start();
		System.out.println("Car starts now");
		
	}
}

class Bus extends FourWheeler{
	void start() {
		super.start();
		System.out.println("Bus starts now");
		
	}
}

class Truck extends FourWheeler{
	void start() {
		super.start();
		System.out.println("Truck starts now");	
	}
}


public class VarArgs {
	
	static void perform(FourWheeler ...ref) {
		for(FourWheeler w:ref) {
			w.start();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		perform(new Car(), new Bus(), new Truck());
	}

}
