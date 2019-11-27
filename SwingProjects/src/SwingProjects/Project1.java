package SwingProjects;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Project1 {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	double res1;
	String ans;
	String op;
	private JTextField textField_1;
	double India=5;
	double United=72.0;
	double China=68.8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project1 window = new Project1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 994, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 592, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 955, 21);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 360, 476);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 610, 626);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Conversion");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100,987, 626);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmExit);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 575, 55);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 111, 590, 305);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b0.getText();
				textField.setText(Number);
			}
		});
		b0.setBounds(10, 252, 55, 37);
		panel_1.add(b0);
		
		JButton b = new JButton(".");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b.getText();
				textField.setText(Number);
			}
		});
		b.setBounds(75, 252, 49, 37);
		panel_1.add(b);
		
		JButton bb = new JButton("00");
		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+bb.getText();
				textField.setText(Number);
			}
		});
		bb.setBounds(134, 252, 55, 37);
		panel_1.add(bb);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b1.getText();
				textField.setText(Number);
				
			}
		});
		b1.setBounds(10, 194, 55, 37);
		panel_1.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b2.getText();
				textField.setText(Number);
			}
		});
		b2.setBounds(75, 194, 49, 37);
		panel_1.add(b2);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b6.getText();
				textField.setText(Number);
			}
		});
		b6.setBounds(134, 143, 55, 40);
		panel_1.add(b6);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b4.getText();
				textField.setText(Number);
			}
		});
		b4.setBounds(10, 143, 55, 40);
		panel_1.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b5.getText();
				textField.setText(Number);
			}
		});
		b5.setBounds(75, 143, 49, 40);
		panel_1.add(b5);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="/";
			}
		});
		btnNewButton_8.setBounds(201, 89, 55, 37);
		panel_1.add(btnNewButton_8);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b7.getText();
				textField.setText(Number);
			}
			
		});
		b7.setBounds(10, 88, 55, 38);
		panel_1.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b8.getText();
				textField.setText(Number);
			}
		});
		b8.setBounds(75, 88, 49, 38);
		panel_1.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b9.getText();
				textField.setText(Number);
			}
		});
		b9.setBounds(134, 88, 57, 37);
		panel_1.add(b9);
		
		JButton btnNewButton_12 = new JButton("<-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strb=new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length()-1);
					b=strb.toString();
					textField.setText(b);
				}
			}
		});
		btnNewButton_12.setBounds(10, 21, 55, 44);
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("CE");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		btnNewButton_13.setBounds(75, 21, 49, 44);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("C");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_14.setBounds(136, 21, 55, 44);
		panel_1.add(btnNewButton_14);
		
		JButton bd = new JButton("-+");
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("-"+num1);
			}
		});
		bd.setBounds(201, 21, 55, 44);
		panel_1.add(bd);
		
		JButton btnNewButton_16 = new JButton("sqrt");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sqrt(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_16.setBounds(266, 20, 55, 46);
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("%");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="%";
			}
			
		});
		btnNewButton_17.setBounds(266, 89, 55, 37);
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("signh");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_18.setBounds(390, 89, 55, 37);
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("cos");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_19.setBounds(331, 89, 55, 37);
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("pie");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3.14");
			}
		});
		btnNewButton_20.setBounds(515, 89, 55, 37);
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("*");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="*";
				
			}
		});
		btnNewButton_21.setBounds(199, 143, 57, 40);
		panel_1.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("lnx");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.log(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_22.setBounds(456, 89, 55, 37);
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("=");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
					
				}
				
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				
				
			}
				
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="mod")
				{
					result=num1%num2;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(num1, num2);
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
				if(op=="cbr")
				{
					result=(num1/num2)*100;
					ans=String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		btnNewButton_23.setBounds(266, 194, 55, 95);
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("+");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="+";
			}
		});
		btnNewButton_24.setBounds(199, 252, 55, 37);
		panel_1.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("sign");
		btnNewButton_25.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sin(num1);
	                textField.setText(String.valueOf(num1));
			}
			
		});
		btnNewButton_25.setBounds(331, 21, 55, 44);
		panel_1.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("Cosh");
		btnNewButton_26.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.cosh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_26.setBounds(390, 21, 55, 44);
		panel_1.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("Mod");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="mod";
			}
		});
		btnNewButton_27.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_27.setBounds(455, 21, 55, 44);
		panel_1.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("log");
		btnNewButton_28.setBounds(515, 21, 55, 44);
		panel_1.add(btnNewButton_28);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+b3.getText();
				textField.setText(Number);
			}
		});
		b3.setBounds(134, 194, 55, 37);
		panel_1.add(b3);
		
		JButton btnNewButton_30 = new JButton("-");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="-";
			}
		});
		btnNewButton_30.setBounds(201, 194, 55, 37);
		panel_1.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("tan");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tan(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_31.setBounds(331, 143, 55, 44);
		panel_1.add(btnNewButton_31);
		
		JButton btnNewButton_32 = new JButton("tanh");
		btnNewButton_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.tanh(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_32.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_32.setBounds(390, 143, 55, 44);
		panel_1.add(btnNewButton_32);
		
		JButton btnNewButton_33 = new JButton("C");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_33.setBounds(456, 143, 55, 44);
		panel_1.add(btnNewButton_33);
		
		JButton btnNewButton_34 = new JButton("x^2");
		btnNewButton_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=num1*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_34.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_34.setBounds(521, 143, 49, 44);
		panel_1.add(btnNewButton_34);
		
		JButton btnNewButton_35 = new JButton("cbr");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="cbr";
			}
			
		});
		btnNewButton_35.setBounds(331, 198, 53, 33);
		panel_1.add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("Rnd");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=Math.round(num1);
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_36.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_36.setBounds(390, 198, 55, 33);
		panel_1.add(btnNewButton_36);
		
		JButton btnNewButton_37 = new JButton("2*p");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6.28");
			}
		});
		btnNewButton_37.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_37.setBounds(456, 198, 55, 33);
		panel_1.add(btnNewButton_37);
		
		JButton btnNewButton_38 = new JButton("x^y");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
			     op="x^y";
			}
			
		});
		btnNewButton_38.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_38.setBounds(515, 201, 55, 30);
		panel_1.add(btnNewButton_38);
		
		JButton btnNewButton_39 = new JButton("Bin");
		btnNewButton_39.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(textField.getText());
                textField.setText(Integer.toBinaryString(n));
			}
		});
		btnNewButton_39.setBounds(334, 252, 49, 37);
		panel_1.add(btnNewButton_39);
		
		JButton btnNewButton_40 = new JButton("Hex");
		btnNewButton_40.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(textField.getText());
                textField.setText(Integer.toHexString(n));
			}
		});
		btnNewButton_40.setBounds(390, 252, 55, 37);
		panel_1.add(btnNewButton_40);
		
		JButton btnNewButton_41 = new JButton("oct");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(textField.getText());
                textField.setText(Integer.toOctalString(n));
			}
		});
		btnNewButton_41.setBounds(456, 252, 55, 37);
		panel_1.add(btnNewButton_41);
		
		JButton btnNewButton_42 = new JButton("x^3");
		btnNewButton_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=num1*num1*num1;
                textField.setText(String.valueOf(num1));
			}
		});
		btnNewButton_42.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_42.setBounds(515, 252, 55, 37);
		panel_1.add(btnNewButton_42);
		
		JButton btnNewButton_2 = new JButton("1/x");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=1/num1;
	                textField.setText(String.valueOf(num1));

			}
		});
		btnNewButton_2.setBounds(266, 143, 55, 40);
		panel_1.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(612, 16, 365, 400);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"India", "United", "China", "Japan"}));
		comboBox.setBounds(89, 88, 202, 27);
		panel_3.add(comboBox);
		
		JLabel l1 = new JLabel("");
		l1.setBackground(Color.WHITE);
		l1.setBounds(89, 215, 202, 27);
		panel_3.add(l1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 142, 202, 47);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("India"))
				{
					String c=String.format("Rs %.2f",bp*India);
					l1.setText(c);
				}if(comboBox.getSelectedItem().equals("United"))
				{
					String c=String.format("$ %.2f",bp*United);
					l1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("China"))
				{
					String c=String.format("rs %.2f",bp*China);
					l1.setText(c);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(40, 286, 129, 34);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);

				l1.setText(null);
			}
		});
		btnNewButton_1.setBounds(205, 286, 129, 34);
		panel_3.add(btnNewButton_1);
		
		JLabel lblConverter = new JLabel("Currency Converter");
		lblConverter.setBounds(96, 27, 195, 41);
		panel_3.add(lblConverter);
		lblConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
	}
}
