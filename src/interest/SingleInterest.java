package interest;

public class SingleInterest extends Function {

	public SingleInterest(int moneyUnit, String strRate, String strPrincipal, String strTime) {
		this.moneyUnit = moneyUnit;
		this.strRate = strRate;
		this.strPrincipal = strPrincipal;
		this.strTime = strTime;
	}
	
	public double Interest (showError se) {
		double f = 0;
		double rate ;
		double principal ;
		int time ;
		try {
			rate = Double.valueOf(strRate);
			principal = Double.valueOf(strPrincipal) * moneyUnit;
			time = Integer.valueOf(strTime);
			if(rate > 0 && principal > 0 && time > 0) {
			double nlx = principal*rate;
			f = nlx*time + principal;
			} else {
				//彈出窗口，提示用戶輸入錯誤；
				se.scanerError();
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			se.havaString();
		}
		return f ;
		
	}
	
	
}
