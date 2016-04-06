package interest;

public class PeriodicIncome extends Function {
	
	public PeriodicIncome(int moneyUnit, String strRate, String strInvestment, String strTime) {
		this.moneyUnit = moneyUnit;
		this.strRate = strRate;
		this.strInv = strInvestment;
		this.strTime = strTime;

	}
	public double Interrest (showError se) {
		double f = 0 ;
		double rate ;
		double inv ;
		int time ;
  		try {
			rate = Double.valueOf(strRate);
			inv = Double.valueOf(strInv) * moneyUnit;
			time = Integer.valueOf(strTime);
			if (inv > 0 && rate > 0 && time > 0) {
				f = inv * (1.0 + rate) * (-1 + Math.pow(1.0 + rate, time)) / rate;
				} else {
					se.scanerError();
				}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			se.havaString();
		}
		
		return f;
	}

	
	
}
