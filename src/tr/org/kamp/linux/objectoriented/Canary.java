package tr.org.kamp.linux.objectoriented;

public class Canary extends Bird implements Herbivore {
	

	

	public Canary(String name, String eyeColor, String furColor, String age, String species) {
		super(name, eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	void tweet() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+" said cik cik.");
		
	}

	@Override
	void live() {
		// TODO Auto-generated method stub
		super.setEyeColor("Black");
		super.setFurColor("Yellow");
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
