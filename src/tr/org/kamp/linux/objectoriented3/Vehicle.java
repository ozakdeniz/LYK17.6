package tr.org.kamp.linux.objectoriented3;

public abstract class Vehicle implements Driveable {
	
	private String brand;
	private String model;
	private int speed;
	private String capacity;
	private int numberOfWheels;
	private boolean hasAerofoil;
	private boolean hasAutoPilot;
	
	enum GasType{
		Dizel , Lpg, Leadedfuel, Unleadedfuel, Superoil 
	}
	
	GasType gasType;
	
	public GasType getGasType() {
		return gasType;
	}

	public void setGasType(GasType gasType) {
		this.gasType = gasType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String i) {
		this.capacity = i;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public boolean isHasAerofoil() {
		return hasAerofoil;
	}

	public void setHasAerofoil(boolean hasAerofoil) {
		this.hasAerofoil = hasAerofoil;
	}

	public boolean isHasAutoPilot() {
		return hasAutoPilot;
	}

	public void setHasAutoPilot(boolean hasAutoPilot) {
		this.hasAutoPilot = hasAutoPilot;
	}


	public Vehicle(String brand, String model, int speed, String capacity, int numberOfWheels,boolean hasAerofoil, boolean hasAuotoPilot, GasType GasType ) {
		this.brand=brand;
		this.model=model;
		this.speed= speed;
		this.capacity=capacity;
		this.numberOfWheels=numberOfWheels;
		this.hasAerofoil=hasAerofoil;
		this.hasAutoPilot=hasAuotoPilot;
		this.gasType= GasType;
	}
	
	String gasTypeMassage() {
		switch(this.gasType) {
		case Dizel:
		return "Dizel gas type.";
		case Lpg:
			return "Lpg gas type.";
		case Leadedfuel:
			return "Leadedfuel gas type";
		case Unleadedfuel:
			return "Unleadedfuel gas type";
		case Superoil:
			return "Superoil gas type";
		default:
			return "Yanlış tip";
		
		}
		
	}

}
