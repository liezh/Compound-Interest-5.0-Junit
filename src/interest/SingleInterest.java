package interest;

public class SingleInterest {
	private String strRate ;
	private String strPrincipal ;
	private String strTime ;

	public SingleInterest(String strRate, String strPrincipal, String strTime) {
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
			principal = Double.valueOf(strPrincipal);
			time = Integer.valueOf(strTime);
			if(rate > 0 && principal > 0 && time > 0) {
			double nlx = principal*rate;
			f = nlx*time + principal;
			} else {
				//�������ڣ���ʾ�Ñ�ݔ���e�`��
				se.scanerError();
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			se.havaString();
		}
		return f ;
		
	}
	
	
}
