package tr.org.kamp.linux.objectoriented3;

public class Car extends Vehicle {

	private int gear;
	
	

	public Car(String brand, String model, int speed, String capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAuotoPilot, GasType GasType) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAuotoPilot, GasType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeMotor() {
		// TODO Auto-generated method stub
		System.out.println("Motor çalıştırıldı.");
	}

	@Override
	public void processGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGear() {
		if(gear>0 && gear<6) {
			this.gear=gear;
		}
		
	}

}
