package Interest_Calculator;

public class CompoundInterest extends InterestCalculator {
	
	public CompoundInterest() {
		
	}
	public CompoundInterest(Double principal,Double rateofInterest , Double timeperiod) {
		
		this.principal=principal;
		this.rofI=rateofInterest;
		this.time_period=timeperiod;
		
	}
	public Double getCompoundInterest() {
		
		return (principal * Math.pow(1.0 + rofI / 100.0, time_period) - principal);
		
	}

}
