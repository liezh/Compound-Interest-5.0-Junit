package interest;

public class Principal {
	private double rare ;
	private double earnings ;
	private int time ;
	private int count ;
	
	public Principal (String strRare, String strEarnings, String strTime, String strCount) {
		this.rare = Double.valueOf(strRare);
		this.earnings = Double.valueOf(strEarnings);
		this.time = Integer.valueOf(strTime);
		this.count = Integer.valueOf(strCount);
	}
	
	public double Interrest () {
		double f = 0 ;
   		if (earnings > 0 || rare > 0 || time > 0 || count > 0) {
				rare = Math.pow(1+rare/count, count)-1;
				f = earnings/Math.pow((rare+1), time);

    		} else {
    			
    		}
		return f ;
	}
	
	
	
	
}
