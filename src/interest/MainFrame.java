package interest;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{
	private int h = Toolkit.getDefaultToolkit().getScreenSize().height;
	private int w = Toolkit.getDefaultToolkit().getScreenSize().width;
	int buttonWidth = 130 ;
	int buttonHeight = 30 ;
	
	int jTextWidth = 130 ;
	int jTextHeight = 30 ;
	public MainFrame(){
		frame();
	}
	
	private void frame() {
		// TODO 自动生成的方法存根
		
		this.setTitle("投资收益计算器");
		this.setSize(500, 500);
		this.setLocation((w-500)/2, (h-500)/2);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.addMouseListener(this);
		this.setVisible(true);
		
		 
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("菜单");
		JMenuItem jmi = new JMenuItem("单位设置");
		JMenuItem jmi1 = new JMenuItem("关于");
		JMenuItem jmi2 = new JMenuItem("单位设置");
		JMenuItem jmi3 = new JMenuItem("单位设置");
		jmb.setVisible(true);
		jmb.add(jm);
		jm.add(jmi);
		jm.add(jmi1);
		
		setJMenuBar(jmb);
		initJButton(jp);
		initJText(jp);
		initJLabel(jp);

		
	}

	JButton jbSingleInterest ;
	JButton jbCompoundInterest ;
	JButton jbInterestTime ;
	JButton jbPeriodicIncome ;
	JButton jbPrincipal ;
	JButton jbRefund ;
	JButton jbBestProject ;
	JButton jbConsequence ;
	JButton jbClear;
	
	private void initJButton (JPanel jp) {
		int y = 0;
		int x = 20;
		int add = 50;
		jbSingleInterest = new JButton("单利计算");
		jbCompoundInterest = new JButton("复利计算");
		jbInterestTime = new JButton("投资时间计算");
		jbPeriodicIncome = new JButton("定投计算");
		jbPrincipal = new JButton("本金估算");
		jbRefund = new JButton("本息还款计算");
		jbBestProject = new JButton("最佳项目计算");
		jbConsequence = new JButton("Enter");
		jbClear = new JButton("Clear");
		
		jbSingleInterest.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbCompoundInterest.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbInterestTime.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbPeriodicIncome.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbPrincipal.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbRefund.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbBestProject.setBounds(x,y = y+add,buttonWidth,buttonHeight);
		jbConsequence.setBounds(300,350,buttonWidth,buttonHeight);
		jbClear.setBounds(300,390,buttonWidth,buttonHeight);
		
		
		this.getContentPane().add(jp);
		jp.add(jbSingleInterest);
		jp.add(jbBestProject);
		jp.add(jbInterestTime);
		jp.add(jbPeriodicIncome);
		jp.add(jbPrincipal);
		jp.add(jbRefund);
		jp.add(jbCompoundInterest);
		jp.add(jbConsequence);
		jp.add(jbClear);
		
		jbSingleInterest.addActionListener(this);
		jbCompoundInterest.addActionListener(this);
		jbInterestTime.addActionListener(this);
		jbPrincipal.addActionListener(this);
		jbPeriodicIncome.addActionListener(this);
		jbConsequence.addActionListener(this);
		jbBestProject.addActionListener(this);
		jbRefund.addActionListener(this);
		jbClear.addActionListener(this);
		
	}
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jtConsequence = new JTextField();
	JTextField jtTitle = new JTextField();
	private void initJText (JPanel jp) {
		int y = 60;
		int x = 300;
		int add = 40;
		jt1.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jt2.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jt3.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jt4.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jtConsequence.setBounds(x,y+add*2,jTextWidth,jTextHeight);
		jp.add(jt1);
		jp.add(jt2);
		jp.add(jt3);
		jp.add(jt4);
		jp.add(jtConsequence);
		
	}
	
	JLabel jl1 = new JLabel("	本金：");
	JLabel jl2 = new JLabel("  年利率：");
	JLabel jl3 = new JLabel("	年限：");
	JLabel jl4 = new JLabel("复利次数：");
	JLabel jl5 = new JLabel("	终值：");
	JLabel jlTitle = new JLabel("复利计算");
	private void initJLabel(JPanel jp) {
		int x = 240;
		int y = 60;
		int add = 40;
		jlTitle.setBounds(x,y,jTextWidth,jTextHeight);
		jl1.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jl2.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jl3.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jl4.setBounds(x,y = y+add,jTextWidth,jTextHeight);
		jl5.setBounds(x,y = y+add*2,jTextWidth,jTextHeight);
		jp.add(jlTitle);
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jl3);
		jp.add(jl4);
		jp.add(jl5);
		
	}

	private void jt4Ture () {
		jt4.setVisible(true);
		jl4.setVisible(true);
	}
	private void jt4False () {
		jt4.setVisible(false);
		jl4.setVisible(false);
	}

	public void actionPerformed(ActionEvent a) {
		// TODO 自动生成的方法存根
		if(a.getActionCommand().equals("单利计算")) {
			initialise();
			
			jlTitle.setText("单利计算");
			jl1.setText("本金：");
			jl2.setText("项目利率：");
			jl3.setText("年限：");
			jt4False();

		} else if(a.getActionCommand().equals("复利计算")) {
			jlTitle.setText("复利计算");
			initialise();
			jl1.setText("本金：");
			jl2.setText("年利率：");
			jl3.setText("年限：");
			jl4.setText("复利次数：");
			jt4Ture();	

		} else if(a.getActionCommand().equals("投资时间计算")) {
			jlTitle.setText("投资时间计算");
			initialise();
			jl3.setText("最终受益：");
			jl1.setText("本金：");
			jl2.setText("年利率：");
			jl4.setText("复利次数：");
			jt4Ture();

		} else if(a.getActionCommand().equals("定投计算")){
			jlTitle.setText("定投计算");
			initialise();
			jl1.setText("每月投资：");
			jl2.setText("年利率：");
			jl3.setText("年限：");
			jt4False();
			
		} else if(a.getActionCommand().equals("本金估算")) {		
			jlTitle.setText("本金估算");
			initialise();
			jl1.setText("最终收益：");
			jl2.setText("年利率：");
			jl3.setText("年限：");
			jl4.setText("复利次数：");
			jt4Ture();

		} else if(a.getActionCommand().equals("本息还款计算")) {
			jlTitle.setText("本息还款计算");
			initialise();
			jl1.setText("贷款金额：");
			jl2.setText("最终收益：");
			jl3.setText("年限：");
			jt4False();

		} else if(a.getActionCommand().equals("最佳项目计算")) {
			jlTitle.setText("最佳项目计算");
			initialise();
			jl1.setText("本金：");
			jl2.setText("最终收益：");
			jl3.setText("年限：");
			jl4.setText("复利次数：");
			jt4Ture();

		} else if(a.getActionCommand().equals("Enter")) {
			if(jt1.getText().trim().equals("") || jt2.getText().trim().equals("") ||jt3.getText().trim().equals("") ){
				JOptionPane jo = new JOptionPane();
				jo.showMessageDialog(null,"请输入数值!");
			}	else {
				System.out.print("22222222222");
				interest ();
			}
	
		}else if(a.getActionCommand().equals("Clear")) {
			initialise();
		}

	}
	private void initialise(){
		 jt1.setText(null); 
		 jt2.setText(null); 
		 jt3.setText(null); 
		 jt4.setText(null); 
		 jtConsequence.setText(null); 
		
	}
	
	private void interest () {
		System.out.print("234324");
		if(jlTitle.getText() == "单利计算") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
//          System.out.print("1111111111111");
			SingleInterest single = new SingleInterest(strRate, strPrincipal, strTime);
			double f = single.Interest();
			jtConsequence.setText(String.valueOf(f));
		}
		else if(jlTitle.getText() == "复利计算") {
			System.out.print("---------");
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			CompoundInterrest compound = new CompoundInterrest(strRate, strPrincipal, strTime,strCount);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "投资时间计算") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strEarnings = jt3.getText() ;
			String strCount = jt4.getText() ;
			InterestTime time = new InterestTime(strRate, strPrincipal, strEarnings, strCount);
			int t = time.Interrest();
			jtConsequence.setText(String.valueOf(t)+"年");
		} else if(jlTitle.getText() == "定投计算"){
			String strInvestment = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			//String strCount = jt4.getText() ;
			PeriodicIncome compound = new PeriodicIncome(strRate, strInvestment, strTime);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "本金估算") {
			//System.out.print("---------");
			String strEarnings = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			Principal compound = new Principal(strRate, strEarnings, strTime,strCount);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "本息还款计算") {
			String strLoan = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
//          System.out.print("1111111111111");
			Refund single = new Refund(strRate, strLoan, strTime);
			double f = single.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "最佳项目计算") {
			String strEarnings = jt1.getText() ;
			String strstrPrincipal = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			BestProject compound = new BestProject(strstrPrincipal, strEarnings, strTime,strCount);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		}
		
	}
	
	
	

	
	
	

}
