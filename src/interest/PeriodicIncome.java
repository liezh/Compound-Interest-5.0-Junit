package interest;

public class PeriodicIncome {
	private double rare ;
	private double inv ;
	private int time ;
	
	public PeriodicIncome(String strRare, String strInvestment, String strTime) {
		this.rare = Double.valueOf(strRare);
		this.inv = Double.valueOf(strInvestment);
		this.time = Integer.valueOf(strTime);

	}
	public double Interrest () {
		double f = 0 ;
  		if (inv > 0 && rare > 0 && time > 0) {
  			f = inv * (1.0 + rare) * (-1 + Math.pow(1.0 + rare, time)) / rare;
    		} else {
    			
    		}
		
		return f;
	}

	
	
}
