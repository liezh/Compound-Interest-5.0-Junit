package interest;

public class Refund extends Function {


	public Refund (int moneyUnit, String strRate, String strLoan, String strTime) {
		this.moneyUnit = moneyUnit;
		this.strRate = strRate;
		this.strLoan = strLoan;
		this.strTime = strTime;
	}
	
	public double Interrest (showError se) {
		double f = 0 ;
		double rate;
		double loan;
		int time;
		try {
			rate = Double.valueOf(strRate);
			loan = Double.valueOf(strLoan) * moneyUnit;
			time = Integer.valueOf(strTime);
			if (rate > 0 && loan > 0 && time > 0) {
				rate = rate/12.0;
				int month = time*12;
				f = loan*rate*Math.pow((1.0+rate), month)/(Math.pow(1.0+rate, month)-1);

			} else {
				se.scanerError();
			}
		} catch (NumberFormatException e) {
			// TODO 自动生成的 catch 块
			se.havaString();
		}
		
		return f ;
	}
	
}
