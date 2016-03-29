package interest;

public class SingleInterest {
	private double rate ;
	private double principal ;
	private int time ;
	private int count ;
	public SingleInterest(String strRate, String strPrincipal, String strTime) {
		this.rate = Double.valueOf(strRate);
		this.principal = Double.valueOf(strPrincipal);
		this.time = Integer.valueOf(strTime);
	}
	
	public double Interest () {
		double f = 0;
		if(rate > 0 && principal > 0 && time > 0) {
		double nlx = principal*rate;
		f = nlx*time + principal;
		} else {
			//彈出窗口，提示用戶輸入錯誤；
		}
		return f ;
		
	}
	
	
}
