package interest;

public class BestProject extends Function{

	public BestProject (int moneyUnit , String strEarnings, String strPrincipal, String strTime, String strCount) {
		this.moneyUnit = moneyUnit;
		this.strEarnings = strEarnings;
		this.strPrincipal = strPrincipal;
		this.strTime = strTime;
		this.strCount = strCount;
	}
	public double Interrest (showError se) {
		double f = 0 ;
		double earnings ;
		double principal ;
		int time ;
		int count ;
		try {
			earnings = Double.valueOf(strEarnings) * moneyUnit;
			principal = Double.valueOf(strPrincipal) * moneyUnit;
			time = Integer.valueOf(strTime);
			count = Integer.valueOf(strCount);
			
			if (earnings > 0 && time > 0 && principal > 0 && count > 0) {
				f = count*(Math.pow(Math.pow(earnings/principal, 1.0/time),1.0/count)-1.0);
			} else {
				se.scanerError();
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			se.havaString();
		}
		return f ;
	}
}
