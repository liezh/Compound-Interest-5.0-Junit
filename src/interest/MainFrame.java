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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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

import mySQL.MySQL;

public class MainFrame extends JFrame implements ActionListener{
	private int h = Toolkit.getDefaultToolkit().getScreenSize().height;
	private int w = Toolkit.getDefaultToolkit().getScreenSize().width;
	int buttonWidth = 130 ;
	int buttonHeight = 30 ;
	
	int jTextWidth = 130 ;
	int jTextHeight = 30 ;
	
	int moneyUnit = 1;
	String str = "# " ;
	double[] items = new double[50];
	
	int N = 0;
	public MainFrame(){
		frame();
	}
	
	
	private void frame() {
		// TODO �Զ����ɵķ������
		
		this.setTitle("Ͷ�����������");
		this.setSize(500, 650);
		this.setLocation((w-500)/2, (h-650)/2);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.addMouseListener(this);
		this.setVisible(true);

		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setLayout(null);
		JMenuBar jmb = new JMenuBar();
		JMenu jmMenu = new JMenu("�˵�");
		JMenu jmiUnit = new JMenu("��λ����");
		JMenuItem jmiWan = new JMenuItem("��Ԫ");
		JMenuItem jmiYuan = new JMenuItem("Ԫ");
		jmiUnit.add(jmiWan);
		jmiUnit.add(jmiYuan);
		jmiWan.addActionListener(this);
		jmiYuan.addActionListener(this);
		
		JMenu jmAbout = new JMenu("����");
		JMenuItem jmiAuthor = new JMenuItem("����");
		jmiAuthor.addActionListener(this);
		
		jmb.setVisible(true);
		jmb.add(jmMenu);
		jmb.add(jmAbout);
		jmMenu.add(jmiUnit);
		
		jmAbout.add(jmiAuthor);
		
		setJMenuBar(jmb);
		
		initJButton(jp);
		initJText(jp);
		initJLabel(jp);
		initJTextArea(jp);
	}

	
	JTextArea jtaPrint ;
	private void initJTextArea (JPanel jp) {
		jtaPrint = new JTextArea();

		jtaPrint.setBounds(40,450,400,100);
		this.getContentPane().add(jp);
		jp.add(jtaPrint);
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
	JLabel jl2 = new JLabel("�����ʣ�");
	JLabel jl3 = new JLabel("	���ޣ�");
	JLabel jl4 = new JLabel("����������");
	JLabel jl5 = new JLabel("	��ֵ��");
	JLabel jlTitle = new JLabel("��������",JLabel.CENTER);
	JLabel jlUnit = new JLabel("��λ��Ԫ",JLabel.CENTER);
	private void initJLabel(JPanel jp) {
		int x = 240;
		int y = 60;
		int add = 40;
		jlUnit.setBounds(x+20,y,jTextWidth,jTextHeight);
		jlTitle.setBounds(x,y-50,jTextWidth+80,jTextHeight+20);
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
		jp.add(jlUnit);
		Font font = new Font("����",Font.BOLD,30);
		jlTitle.setFont(font);
		
	}
	/*
	 * ����������������ǣ����������4�Ƿ���Ҫ��ʾ��
	 */
	private void jt4Ture () {
		jt4.setVisible(true);
		jl4.setVisible(true);
	}
	private void jt4False () {
		jt4.setVisible(false);
		jl4.setVisible(false);
	}
	/*
	 * �÷������ڼ���û�������ϵĲ�������һ���¼�������ʵ�ַ�����
	 */
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
			jl2.setText("�����ʣ�");
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
				try {
					interest ();
				} catch (Throwable e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}else if(a.getActionCommand().equals("Clear")) {
			initialise();
		}else if(a.getActionCommand().equals("����")) {
			JOptionPane jo = new JOptionPane();
			jo.showMessageDialog(null,"���ߣ���־�� \n ���ʱ�䣺2016.4.2.14��50 \n �汾�ţ�5.1");
		}else if(a.getActionCommand().equals("��Ԫ")) {
			moneyUnit = 10000;
			jlUnit.setText("��λ����Ԫ");
		}else if(a.getActionCommand().equals("Ԫ")) {
			moneyUnit = 1;
			jlUnit.setText("��λ��Ԫ");
		}
		

	}
	/*
	 * �÷������ڰ������������ա�
	 */
	private void initialise(){
		 jt1.setText(null); 
		 jt2.setText(null); 
		 jt3.setText(null); 
		 jt4.setText(null); 
		 jtConsequence.setText(null); 
		
	}
	
	/*
	 * �÷��������ж��û�ѡ������㷽ʽ������������������jtConsequence�С�
	 */
	private void interest () throws Throwable {
		final JOptionPane jo = new JOptionPane();
		
		MySQL sql = new MySQL();
		if(jlTitle.getText() == "��������") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			SingleInterest single = new SingleInterest(moneyUnit,strRate, strPrincipal, strTime);
			double f = single.Interest(new showError() {

				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}

				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
					
				}
			});
			try {

				sql.sqlInsertSingle(moneyUnit, strRate, strPrincipal, strTime);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			
			
			items[N++] = f;
			jtConsequence.setText(String.valueOf(f));
		}
		else if(jlTitle.getText() == "��������") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			CompoundInterrest compound = new CompoundInterrest(moneyUnit, strRate, strPrincipal, strTime,strCount);
			double f = compound.Interrest(new showError() {

				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}

				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
				}
				
			});
			try {
				sql.sqlInsertCompound(moneyUnit, strRate, strPrincipal, strTime, strCount);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			items[N++] = f;
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "Ͷ��ʱ�����") {
			String strPrincipal = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strEarnings = jt3.getText() ;
			String strCount = jt4.getText() ;
			InterestTime time = new InterestTime(moneyUnit, strRate, strPrincipal, strEarnings, strCount);
			double t = time.Interrest(new showError() {

				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}

				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
				}
				
			});
			try {
				sql.sqlInsertTime(moneyUnit, strRate, strPrincipal, strEarnings, strCount);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			items[N++] = t;
			jtConsequence.setText(String.valueOf(t)+"��");
		} else if(jlTitle.getText() == "��Ͷ����"){
			String strInvestment = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			//String strCount = jt4.getText() ;
			PeriodicIncome perincome = new PeriodicIncome(moneyUnit, strRate, strInvestment, strTime);
			double f = perincome.Interrest(new showError() {
				
				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}
				
				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
				}
			});
			try {
				sql.sqlInsertPerincome(moneyUnit, strRate, strInvestment, strTime);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			items[N++] = f;
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "�������") {
			String strEarnings = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			Principal principal = new Principal(moneyUnit, strRate, strEarnings, strTime,strCount);
			double f = principal.Interrest(new showError() {
				
				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}
				
				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
				}
			});
			try {
				sql.sqlInsertPrincipal(moneyUnit, strRate, strEarnings, strTime, strCount);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			items[N++] = f;
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "��Ϣ�������") {
			String strLoan = jt1.getText() ;
			String strRate = jt2.getText() ;
			String strTime = jt3.getText() ;
			Refund refund = new Refund(moneyUnit, strRate, strLoan, strTime);
			double f = refund.Interrest(new showError() {
				
				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}
				
				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
				}
			});
			try {

				sql.sqlInsertRefund(moneyUnit, strRate, strLoan, strTime);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			items[N++] = f;
			jtConsequence.setText(String.valueOf(f));
			
		} else if(jlTitle.getText() == "�����Ŀ����") {
			String strEarnings = jt1.getText() ;
			String strPrincipal = jt2.getText() ;
			String strTime = jt3.getText() ;
			String strCount = jt4.getText() ;
			BestProject bestProject = new BestProject(moneyUnit, strPrincipal, strEarnings, strTime,strCount);
			double f = bestProject.Interrest(new showError() {
				
				@Override
				public void scanerError() {
					// TODO �Զ����ɵķ������
					jo.showMessageDialog(null,"�����и���!\n ���������룡��");
					initialise();
				}
				
				@Override
				public void havaString() {
					// TODO �Զ����ɵķ������
					JOptionPane.showMessageDialog(null,"�������ַ�!\n ���������룡��");
					initialise();
				}
			});
			try {
				
				sql.sqlInsertBestProject(moneyUnit, strEarnings, strPrincipal, strTime, strCount);
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				System.out .print("���ݿ��쳣����");
			}
			items[N++] = f;
			jtConsequence.setText(String.valueOf(f));
			
		}
		double d = 0;
		for(int i =0 ; i<N ; i++){
			System.out.print(items[i]);
			d += items[i];
		}
		String strSum = "������=" + String.valueOf(d);
		str += ("	��Ŀ"+ String.valueOf(N) + ':' + String.valueOf(items[N-1]) + '\n');
		jtaPrint.setText(str + strSum);
	}

}
