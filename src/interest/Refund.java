package interest;

public class Refund {
	
	private double rare ;
	private double loan ;
	private int time ;
	public Refund (String strRare, String strLoan, String strTime) {
		this.rare = Double.valueOf(strRare);
		this.loan = Double.valueOf(strLoan);
		this.time = Integer.valueOf(strTime);
	}
	
	public double Interrest () {
		double f = 0 ;
		if (rare > 0 || loan > 0 || time > 0) {
			rare = rare/12.0;
			int month = time*12;
			f = loan*rare*Math.pow((1.0+rare), month)/(Math.pow(1.0+rare, month)-1);

		} else {

		}
		
		return f ;
	}
	
}
