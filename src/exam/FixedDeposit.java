package exam;

public class FixedDeposit {
	float amount;
	float rate;
	int period;
	String acctnum;
	
	FixedDeposit(float amount,float rate,int period)
	{
		this.amount=amount;
		this.rate=rate;
		this.period=period;
	}
}
