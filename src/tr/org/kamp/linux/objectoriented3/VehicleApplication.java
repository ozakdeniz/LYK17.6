package tr.org.kamp.linux.objectoriented3;

import tr.org.kamp.linux.objectoriented3.Plane.LiftOffType;
import tr.org.kamp.linux.objectoriented3.Vehicle.GasType;

public class VehicleApplication {

	

	public static void main(String[] args) {
		
	Car car = new Car("Volvo","32asd5",320,"5",4,false,true,GasType.Dizel);
	Plane plane = new Plane ("Pegasus","235işlk9",1200,"120",6,true,true,GasType.Superoil, LiftOffType.LIFT_OFF_HORIZONTAL);
	
	car.gasTypeMassage();
	plane.setCapacity("200");
	plane.gasTypeMassage();
	

	System.out.println(plane.getBrand()+" "+plane.getCapacity()+" kapasiteli uçuşları mevcuttur.");
	System.out.println(car.getBrand()+" marka araçlar çok kalitelidir.");
	System.out.println("Arabamızda kullanılan gaz tipi :"+ car.gasTypeMassage());
	System.out.println(plane.getBrand()+ " uçaklarımızda "+ plane.gasTypeMassage()+" kullanılır.");
		
	}

}
