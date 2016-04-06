package mySQL;
import java.sql.*;

import com.mysql.jdbc.Connection;

public class MySQL {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	    static final String DB_URL = "jdbc:mysql://localhost/test";


	    static final String USER = "root";
	    static final String PASS = "lzh";
	    private int MAX = 100 ;
		private String[] items = new String[MAX];
		private int N = 1;
        Connection conn = null;    //创建一个MYSQL的链接对象
        Statement stmt = null;		//创建声明
	    public MySQL() throws Exception {
	
	    	
	        //STEP 2: Register JDBC driver
	        Class.forName(JDBC_DRIVER);      //添加MYSQL驱动

	        //STEP 3: Open a connection  链接本地MYSQL
	        conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);    
	       
	        //STEP 4: Execute a query
	        stmt = conn.createStatement();
	        String sql;
	        sql = "SELECT * FROM test";
	        ResultSet rs = stmt.executeQuery(sql);

	        //STEP 5: Extract data from result set
	        while(null != rs && rs.next()){
	        	System.out.println(rs.getString("rate"));
	        	System.out.println(rs.getString("time"));
	        	System.out.println(rs.getString("principal"));
	        }
	       
//	        String sql1 = "insert into test(items) values ('intem_3')" ;       
//	        stmt.executeUpdate(sql1);
	       
//	        rs.close();
//	        stmt.close();
//	        conn.close();
	    }
	    
	    
	    public void sqlInsertSingle(int moneyUnit, String strRate, String strPrincipal,
	    		String strTime) throws SQLException {
	    	
	    	items[N] = "item_" + String.valueOf(N);
	    	String sql1 = "insert into test(rate,time,principal)values('"
	    	+ strRate + "','" + strTime + "','" + strPrincipal + "')" ; 
	        stmt.executeUpdate(sql1);
	        
	    }
	    
	    public void sqlInsertCompound(int moneyUnit, String strRate, String strPrincipal,
	    	String strTime, String strCount) throws SQLException {
	    	
	    	items[N] = "item_" + String.valueOf(N);
	    	String sql1 = "insert into test(rate,time,count,principal)values('" +
	    			strRate  + "','" + strTime + "','"  + strCount + "','"  + strPrincipal + "')" ;    
	        stmt.executeUpdate(sql1);
	    }
	    
	    public void sqlInsertTime(int moneyUnit, String strRate, String strPrincipal,
	    	String strEarnings, String strCount) throws SQLException {
	    	
		   	items[N] = "item_" + String.valueOf(N);
		   	String sql1 = "insert into test(rate,count,principal,earnings)values('" +
		   			strRate + "','"  + strCount + "','"  + strPrincipal + "','"  + strEarnings + "')" ;    
	       stmt.executeUpdate(sql1);
	    }
	    
	    public void sqlInsertPerincome (int moneyUnit, String strRate, String strInvestment,
	    		String strTime) throws SQLException {
	    	
	    	items[N] = "item_" + String.valueOf(N);
		   	String sql1 = "insert into test(rate,time,inv)values('" +
		   			strRate + "','"  + strTime + "','"  + strInvestment + "')" ;
	       stmt.executeUpdate(sql1);
	    }
	    
	    public void sqlInsertPrincipal(int moneyUnit, String strRate, String strEarnings,
	    		String strTime, String strCount) throws SQLException{
	    	
	    	items[N] = "item_" + String.valueOf(N);
		   	String sql1 = "insert into test(rate,time,count,earnings)values('"+
		   			strRate + "','"  + strTime + "','"  + strCount + "','"   + strEarnings + "')" ;
	       stmt.executeUpdate(sql1);
	    	
	    }
	    
	    public void sqlInsertRefund (int moneyUnit, String strRate, String strLoan,
	    		String strTime) throws SQLException {
	    	
	    	items[N] = "item_" + String.valueOf(N);
		   	String sql1 = "insert into test(rate,time,loan)values('" +
		   			strRate + "','"  + strTime + "','"  + strLoan +"')" ;
	       stmt.executeUpdate(sql1);
	    }
	    
	    public void sqlInsertBestProject (int moneyUnit , String strEarnings,
	    		String strPrincipal, String strTime, String strCount) throws SQLException {
	    	
	    	items[N] = "item_" + String.valueOf(N);
		   	String sql1 = "insert into test(items,time,count,principal,earnings)values('" +
	    	items[N++] + "','"  + strTime + "','"  + strCount + "','"  + strPrincipal + "','"  + strEarnings + "')" ;
	       stmt.executeUpdate(sql1);
	    }
	    
	    
	
}
