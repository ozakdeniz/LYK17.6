package tr.org.kamp.linux.oorientedatm;

public class UserExceptions extends Exception {
	
	public String getMessageForPassword() {
		return "Şifreyi doğru girdiğinizden emin olunuz";
	}
	
	public String getMessageForAmount() {
		return "Yaptığınız işlem hatalıdır";
	}
	public String getMessageForId() {
		return "Kart numaranızı eksik veya yanlış girdiniz";
	}

}
