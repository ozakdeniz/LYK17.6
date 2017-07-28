package tr.org.kamp.linux.objectoriented2;

public class MonstersApplication {
	
	public static void main(String[] args) {
		
		
		Dragon dragon =new Dragon("yellow","drago","dragon",true);
		Vampire vampire = new Vampire("red","vam","vampire",true);

		
		dragon.breathFire();
		dragon.fly();
		vampire.bite();
	}	
	}


