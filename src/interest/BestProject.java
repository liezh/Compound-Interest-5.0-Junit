package interest;

public class BestProject {

	String strEarnings ;   //����������ַ���
	String strPrincipal ;  //������ַ���
	String strTime ;       //���޵��ַ���
	String strCount ;      //��������
	public BestProject (String strEarnings, String strPrincipal, String strTime, String strCount) {
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
			earnings = Double.valueOf(strEarnings);
			principal = Double.valueOf(strPrincipal);
			time = Integer.valueOf(strTime);
			count = Integer.valueOf(strCount);
			
			if (earnings > 0 && time > 0 && principal > 0 && count > 0) {
				f = count*(Math.pow(Math.pow(earnings/principal, 1.0/time),1.0/count)-1.0);
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
