package Interest_Calculator;

public class SimpleInterest extends InterestCalculator {

	public void Simple() {
		
	}
	public SimpleInterest(Double principal ,Double rateofInterest, Double timeperiod) {
		
		this.principal=principal;
		this.rofI = rateofInterest;
		this.time_period= timeperiod;
	
	}
	
	public Double getSimpleInterest() {
		
		return ((principal * time_period * rofI)/100);
		
	}
}
