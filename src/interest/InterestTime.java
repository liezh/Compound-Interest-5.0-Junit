package interest;

public class InterestTime {
	
	private String strRate;
	private String strPrincipal;
	private String strEarnings;
	private String strCount;
	
	public InterestTime(String strRate, String strPrincipal, String strEarnings, String strCount) {
		this.strRate = strRate;
		this.strPrincipal = strPrincipal;
		this.strEarnings = strEarnings;
		this.strCount = strCount;
	}

	public int Interrest(showError se) {
		int t = 0;
		double rate;
		double principal;
		double earnings;
		int count;
		try {
			rate = Double.valueOf(strRate);
			principal = Double.valueOf(strPrincipal);
			earnings = Double.valueOf(strEarnings);
			count = Integer.valueOf(strCount);
			if (earnings > 0 && rate > 0 && principal > 0 && count > 0) {
				rate = Math.pow(1 + rate / count, count) - 1;
				t = (int) (Math.log(earnings / principal) / Math.log(1 + rate));

			} else {
				se.scanerError();
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			se.havaString();
		}
		return t;
	}
	
	
	
}
