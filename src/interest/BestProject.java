package interest;

public class BestProject {
	private double earnings ;
	private double principal ;
	private int time ;
	private int count ;
	
	public BestProject (String strEarnings, String strPrincipal, String strTime, String strCount) {
		this.earnings = Double.valueOf(strEarnings);
		this.principal = Double.valueOf(strPrincipal);
		this.time = Integer.valueOf(strTime);
		this.count = Integer.valueOf(strCount);
	}
	public double Interrest () {
		double f = 0 ;
		if (earnings > 0 || time > 0 || principal > 0 || count > 0) {
			f = count*(Math.pow(Math.pow(earnings/principal, 1.0/time),1.0/count)-1.0);

		} else {

		}
		return f ;
	}
}
