package tr.org.kamp.linux.objectoriented3;

public class Plane extends Vehicle {
	
	public Plane(String brand, String model, int speed, String capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAuotoPilot, GasType GasType,LiftOffType liftOffType) {
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAuotoPilot, GasType);
		// TODO Auto-generated constructor stub
		this.maximumFeet=maximumFeet;
		this.flightCode=flightCode;
		this.isAutoPilotActive=isAutoPilotActive;
		this.liftOffType=liftOffType;
	}

	

	LiftOffType liftOffType;
	private int maximumFeet;
	private String flightCode;
	private boolean isAutoPilotActive;
	
	
	
	public int getMaximumFeet() {
		return maximumFeet;
	}
	public void setMaximumFeet(int maximumFeet) {
		this.maximumFeet = maximumFeet;
	}
	
	
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	
	
	public boolean isAutoPilotActive() {
		return isAutoPilotActive;
	}
	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}
	
	
	public LiftOffType getLiftOffType() {
		return liftOffType;
	}
	public void setLiftOffType(LiftOffType liftOffType) {
		this.liftOffType = liftOffType;
	}
	
	
	

	
	enum LiftOffType {
		LIFT_OFF_HORIZONTAL, LIFT_OFF_VERTICAL
	}
	public void liftOffMessage() {
		
	}

	

	@Override
	public void executeMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGear() {
		// TODO Auto-generated method stub
		
	}

}
