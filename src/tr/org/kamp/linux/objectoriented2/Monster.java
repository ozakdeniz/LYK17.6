package tr.org.kamp.linux.objectoriented2;

public abstract class Monster {
	
	abstract String frighten();
	
	String eyeColor;
	boolean sharpTeeth;
	String name;
	String type;
	
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public boolean isSharpTeeth() {
		return sharpTeeth;
	}
	public void setSharpTeeth(boolean sharpTeeth) {
		this.sharpTeeth = sharpTeeth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	public Monster(String eyeColor, String name, String type, boolean sharpTeeth) {
		
	}
	

}
