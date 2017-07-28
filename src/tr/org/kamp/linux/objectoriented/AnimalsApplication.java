package tr.org.kamp.linux.objectoriented;

public class AnimalsApplication {
	
	
	public static void main(String[] args) {
		
		Cats sari = new Cats("Sarı", "Sarı", "Sarı"," 3", "Düz kedi");
		Snake bill = new Snake("Gill Bates", "Kırmızı", "Kırmızı", "60", "Sinsi yılan");
		Canary canary = new Canary("Maviş", "Beyaz", "Mavi", "2", "İlginç kanarya");
		
		sari.hunt();
		
		bill.eatPlants();
		
		canary.fly();
		System.out.println(sari.meow+" dedi");
	}

}
