package testPack;

class Engine{
	void on() {
		System.out.println("basic On");
	}
}

class MarutiEngine extends Engine {
	void on() {
		System.out.println("Maruti Engine starts");
	}
}

class HondaEngine extends Engine{
	void on() {
		System.out.println("Honda Engine starts");
	}
}

class FourWheeler{
	void starts() {
		System.out.println("FourWheeler starts");
	}
}

class Car extends FourWheeler{
	Engine E;
	Car(Engine e){
		this.E=e;
	}
	
	void starts() {
		super.starts();
		E.on();
	}
}

class Truck extends FourWheeler{
	Engine E;
	Truck(Engine e){
		this.E=e;
	}
	
	void starts() {
		super.starts();
		E.on();
	}
}

class Bus extends FourWheeler{
	Engine E;
	Bus(Engine e){
		this.E=e;
	}
	
	void starts() {
		super.starts();
		E.on();
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car(new MarutiEngine());
		c.starts();
		
		FourWheeler w[]= {new Car(new MarutiEngine()), new Truck(new HondaEngine())};
		for(FourWheeler i:w) {
			i.starts();
		}
	}
}
