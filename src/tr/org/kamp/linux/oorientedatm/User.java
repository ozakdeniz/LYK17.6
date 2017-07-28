package tr.org.kamp.linux.oorientedatm;

public class User {
	
	private String accountNumber ;
	private String password;
	private double amount;
	

	public User(String accountNumber , String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public User(String accountNumber , String password , double amount) {
		this.accountNumber = accountNumber;
		this.password = password;
		this.amount = amount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	public void passwordControl(String password) throws UserExceptions {
		if(password.length() < 4 && password.length() > 4) {
			throw new UserExceptions();
			
		}else {
			this.password=password;
		}
		
	}
	
	public void idContol(String id) throws UserExceptions {
		if(id.length() != 11) {  
			throw new UserExceptions();
		}/// hata fırlat
		else this.accountNumber = id;
	
	}
	
	public void amountControl(int amount) {
		if(amount < 10 || amount > 500) {
			try {
				throw new UserExceptions();
				
			} catch (UserExceptions e) {
				// TODO Auto-generated catch block
				System.out.println("Not değeri 0-100 arası olmalıdır");
			}
			
		}else {
			this.amount = amount;

			
		}
	}
}
