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
		// TODO �Զ����ɵķ������
		
		this.setTitle("Ͷ�����������");
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
		JMenu jm = new JMenu("�˵�");
		JMenuItem jmi = new JMenuItem("��λ����");
		JMenuItem jmi1 = new JMenuItem("����");
		JMenuItem jmi2 = new JMenuItem("��λ����");
		JMenuItem jmi3 = new JMenuItem("��λ����");
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
		jbSingleInterest = new JButton("��������");
		jbCompoundInterest = new JButton("��������");
		jbInterestTime = new JButton("Ͷ��ʱ�����");
		jbPeriodicIncome = new JButton("��Ͷ����");
		jbPrincipal = new JButton("�������");
		jbRefund = new JButton("��Ϣ�������");
		jbBestProject = new JButton("�����Ŀ����");
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
	
	JLabel jl1 = new JLabel("	����");
	JLabel jl2 = new JLabel("  �����ʣ�");
	JLabel jl3 = new JLabel("	���ޣ�");
	JLabel jl4 = new JLabel("����������");
	JLabel jl5 = new JLabel("	��ֵ��");
	JLabel jlTitle = new JLabel("��������");
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
		// TODO �Զ����ɵķ������
		if(a.getActionCommand().equals("��������")) {
			initialise();
			
			jlTitle.setText("��������");
			jl1.setText("����");
			jl2.setText("��Ŀ���ʣ�");
			jl3.setText("���ޣ�");
			jt4False();

		} else if(a.getActionCommand().equals("��������")) {
			jlTitle.setText("��������");
			initialise();
			jl1.setText("����");
			jl2.setText("�����ʣ�");
			jl3.setText("���ޣ�");
			jl4.setText("����������");
			jt4Ture();	

		} else if(a.getActionCommand().equals("Ͷ��ʱ�����")) {
			jlTitle.setText("Ͷ��ʱ�����");
			initialise();
			jl3.setText("�������棺");
			jl1.setText("����");
			jl2.setText("�����ʣ�");
			jl4.setText("����������");
			jt4Ture();

		} else if(a.getActionCommand().equals("��Ͷ����")){
			jlTitle.setText("��Ͷ����");
			initialise();
			jl1.setText("ÿ��Ͷ�ʣ�");
			jl2.setText("�����ʣ�");
			jl3.setText("���ޣ�");
			jt4False();
			
		} else if(a.getActionCommand().equals("�������")) {		
			jlTitle.setText("�������");
			initialise();
			jl1.setText("�������棺");
			jl2.setText("�����ʣ�");
			jl3.setText("���ޣ�");
			jl4.setText("����������");
			jt4Ture();

		} else if(a.getActionCommand().equals("��Ϣ�������")) {
			jlTitle.setText("��Ϣ�������");
			initialise();
			jl1.setText("�����");
			jl2.setText("�������棺");
			jl3.setText("���ޣ�");
			jt4False();

		} else if(a.getActionCommand().equals("�����Ŀ����")) {
			jlTitle.setText("�����Ŀ����");
			initialise();
			jl1.setText("����");
			jl2.setText("�������棺");
			jl3.setText("���ޣ�");
			jl4.setText("����������");
			jt4Ture();

		} else if(a.getActionCommand().equals("Enter")) {
			if(jt1.getText().trim().equals("") || jt2.getText().trim().equals("") ||jt3.getText().trim().equals("") ){
				JOptionPane jo = new JOptionPane();
				jo.showMessageDialog(null,"��������ֵ!");
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
		if(jlTitle.getText() == "��������") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
//          System.out.print("1111111111111");
			SingleInterest single = new SingleInterest(strRate, strPrincipal, strTime);
			double f = single.Interest();
			jtConsequence.setText(String.valueOf(f));
		}
		else if(jlTitle.getText() == "��������") {
			System.out.print("---------");
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			CompoundInterrest compound = new CompoundInterrest(strRate, strPrincipal, strTime,strCount);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "Ͷ��ʱ�����") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strEarnings = jt3.getText() ;
			String strCount = jt4.getText() ;
			InterestTime time = new InterestTime(strRate, strPrincipal, strEarnings, strCount);
			int t = time.Interrest();
			jtConsequence.setText(String.valueOf(t)+"��");
		} else if(jlTitle.getText() == "��Ͷ����"){
			String strInvestment = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			//String strCount = jt4.getText() ;
			PeriodicIncome compound = new PeriodicIncome(strRate, strInvestment, strTime);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "�������") {
			//System.out.print("---------");
			String strEarnings = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			Principal compound = new Principal(strRate, strEarnings, strTime,strCount);
			double f = compound.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "��Ϣ�������") {
			String strLoan = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
//          System.out.print("1111111111111");
			Refund single = new Refund(strRate, strLoan, strTime);
			double f = single.Interrest();
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "�����Ŀ����") {
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
