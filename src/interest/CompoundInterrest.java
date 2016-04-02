package interest;

public class CompoundInterrest {
	private String strRate;
	private String strPrincipal;
	private String strTime;
	private String strCount;

	public CompoundInterrest(String strRate, String strPrincipal,
			String strTime, String strCount) {
		this.strRate = strRate;
		this.strPrincipal = strPrincipal;
		this.strTime = strTime;
		this.strCount = strCount;
	}

	public double Interrest(showError se) {
		double f = 0;
		double rate;
		double principal;
		int time;
		int count;
		try {
			rate = Double.valueOf(strRate);
			principal = Double.valueOf(strPrincipal);
			time = Integer.valueOf(strTime);
			count = Integer.valueOf(strCount);
			if (principal > 0 && rate > 0 && time > 0 && count > 0) {
				rate = Math.pow(1 + rate / count, count) - 1;
				f = principal * Math.pow((rate + 1), time);
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
