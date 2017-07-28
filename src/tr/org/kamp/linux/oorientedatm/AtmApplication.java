package tr.org.kamp.linux.oorientedatm;

import java.nio.channels.ShutdownChannelGroupException;

public class AtmApplication {
	
	public static void main(String[] args) {
		User user = new User("1", "2");
		Oorientedatm atm = new Oorientedatm(user);
		
		generateUsers(atm);
		showUsers(atm);
		atm.Login(user);
	
		
		
		int credit = atm.credit(100) ;
		if(credit == 1) {
			System.out.println("para yatırma işlemi başarılı");
		}else if(credit == -1){
			System.out.println("para yatırma işlemi başarısız");

		}
			System.out.println(" güncel " + atm.getUser().getAmount());
			
		atm.logout();	
			
		int withDrawal = atm.withdrawal(80);
		if(withDrawal == 1) {
			System.out.println("Para çekme işlemi başarılı");
		}else if(withDrawal == -1) {
			System.out.println("Lütfen giriş yapınız ");
		}else {
			System.out.println("Bakiyeden büyük değer girdiniz, işlem başarısız");
		}
		
		System.out.println(" güncel2 " + atm.getUser().getAmount());

	}

	private static void generateUsers(Oorientedatm atm) {
		User u;
		int amount = 500;
		for(int i = 0 ; i < atm.getUserList().length ; i++) {
			u = new User(Integer.toString(i+1), Integer.toString(i+2), amount+=100);
			atm.setUserList(u, i );
			
		}
		
		
	}
	
	
	private static  void showUsers(Oorientedatm atm) {
		System.out.println("======Hesaplar=====");
		for(int i = 0 ; i < atm.getUserList().length ; i++) {
			System.out.println(atm.getUserList()[i].getAccountNumber()+  " "
					+atm.getUserList()[i].getPassword()+"  " +
					atm.getUserList()[i].getAmount());
		}
	}
}
