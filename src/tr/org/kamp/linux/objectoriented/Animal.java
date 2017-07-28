package tr.org.kamp.linux.objectoriented;

public abstract class Animal {
	
	private String name;
	private String eyeColor;
	private String furColor;
	private String age;
	private String species;
	
	public Animal(String name, String eyeColor, String furColor, String age, String species ){
		this.name = name;
		this.eyeColor = eyeColor;
		this.furColor = furColor;
		this.age = age;
		this.species = species;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	abstract void live();
	abstract void getOld();
	abstract void die();
}
