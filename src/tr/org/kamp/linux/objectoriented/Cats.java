package tr.org.kamp.linux.objectoriented;

public class Cats extends Mammal implements Carnivore {
	
	

	
	
	public Cats(String name, String eyeColor, String furColor, String age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	String meow;

	public void roar(String roartype) {
		this.meow=roartype;
		System.out.println(super.getName()+" said meoww.");
	}


	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void live() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getOld() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void die() {
		// TODO Auto-generated method stub
		
	}

}
