package javaPro;

public class BankClass {
	
	private String acNumber;
	private double bal;
	
	public BankClass(String acNumber, double bal){
		this.acNumber=acNumber;
		this.bal=bal;
	}
	
	public void setAccountNumber(String acNumber) {
		this.acNumber=acNumber;
	}
	
	public String getAccountNumber() {
		return acNumber;
	}
	
	public void setBal(double bal) {
		this.bal=bal;
	}
	
	public double getBal() {
		return bal;
	}
	

}
