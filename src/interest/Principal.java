package interest;

public class Principal {
	private String strRate;
	private String strTime;
	private String strEarnings;
	private String strCount;
	
	public Principal (String strRare, String strEarnings, String strTime, String strCount) {
		this.strRate = strRare;
		this.strEarnings = strEarnings;
		this.strTime = strTime;
		this.strCount = strCount;
	}
	
	public double Interrest (showError se) {
		double f = 0 ;
		double rate;
		double earnings;
		int time;
		int count;
   		try {
			rate = Double.valueOf(strRate);
			earnings = Double.valueOf(strEarnings);
			time = Integer.valueOf(strTime);
			count = Integer.valueOf(strCount);
			if (earnings > 0 && rate > 0 && time > 0 && count > 0) {
					rate = Math.pow(1+rate/count, count)-1;
					f = earnings/Math.pow((rate+1), time);

				} else {
					se.scanerError();
				}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			se.havaString();
		}
		return f ;
	}
	
	
	
	
}
