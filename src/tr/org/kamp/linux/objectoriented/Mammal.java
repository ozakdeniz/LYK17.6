package tr.org.kamp.linux.objectoriented;

public abstract class Mammal extends Animal {
	
	public Mammal(String name, String eyeColor, String furColor, String age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	

	abstract void giveBirth();

}
