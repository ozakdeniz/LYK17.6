package tr.org.kamp.linux.objectoriented;

public abstract class Bird extends Animal {
	
	
	public Bird(String name, String eyeColor, String furColor, String age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}
	
	abstract void fly();
	abstract void tweet();

}
