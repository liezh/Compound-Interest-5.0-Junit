package interest;

public class CompoundInterrest {
	private double rate ;
	private double principal ;
	private int time ;
	private int count ;
	
	public CompoundInterrest(String strRate, String strPrincipal, String strTime, String strCount) {
		this.rate = Double.valueOf(strRate);
		this.principal = Double.valueOf(strPrincipal);
		this.time = Integer.valueOf(strTime);
		this.count = Integer.valueOf(strCount);
	}
	
	public double Interrest () {
		double f = 0 ;
  		if (principal > 0 || rate > 0 || time > 0 || count > 0) {
				rate = Math.pow(1+rate/count, count)-1;
				f = principal*Math.pow((rate+1), time);
    		} else {
    			
    		}
		
		return f;
	}
	
}
