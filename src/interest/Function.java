package interest;

public class Function {
	
	public int moneyUnit;  //金钱单位有--万元--元
	String strEarnings ;   //最终受益的字符串
	String strPrincipal ;  //本金的字符串
	String strTime ;       //年限的字符串
	String strCount ;      //复利次数的字符串
	String strRate;        //年利率的字符串
	String strInv ;        //每月定投金额的字符串
	String strLoan;
	/*
	 * 用于提供给各子类，用于计算。
	 * 但是具体计算的公式与方法需要个子类重写。
	 */
	public double Interrest (showError se) {
		
		return 0;
	}

	
	
	/*
	 * 用于改变计算中的金钱的单位，方便用户输入数据。
	 * 当数额过大时避免输入太多零，而引起不必要的输入错误。
	 */
	public void setMoneyUnit(int moneyUnit) {
		this.moneyUnit = moneyUnit ;
	}
}
