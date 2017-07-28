package tr.org.kamp.linux.objectoriented2;

public class Dragon extends Monster implements Scarer, Flyable {
	


	public Dragon(String eyeColor, String name, String type, boolean sharpTeeth) {
		super(eyeColor, name, type, sharpTeeth);
		// TODO Auto-generated constructor stub
	}

	public String breathFire() {
		System.out.println(super.getType()+" can kill you with its fire breath");
		return "AAARRRRGGGGHHHHHh";
		
	}
	
	public void loveShinyThings() {
		System.out.println(super.getType()+ "loves shiny things.");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canMakeYouScare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String frighten() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
