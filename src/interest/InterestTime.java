package interest;

public class InterestTime {
	
	private double rate ;
	private double principal ;
	private double earnings ;
	private int count ;
	
	public InterestTime(String strRate, String strPrincipal, String strEarnings, String strCount) {
		this.rate = Double.valueOf(strRate);
		this.principal = Double.valueOf(strPrincipal);
		this.earnings = Double.valueOf(strEarnings);
		this.count = Integer.valueOf(strCount);
	}

	public int Interrest () {
		int t = 0 ;
   		if (earnings > 0 || rate > 0 || principal > 0 || count > 0) {
				rate = Math.pow(1+rate/count, count)-1;
				t = (int)(Math.log(earnings/principal)/Math.log(1+rate));
    			
    		} else {
    			
    		}
		return t ;
	}
	
	
	
}
